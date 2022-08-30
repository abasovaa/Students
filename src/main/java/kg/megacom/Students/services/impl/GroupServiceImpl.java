package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Course;
import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Lesson;
import kg.megacom.Students.models.enums.Day;
import kg.megacom.Students.models.requests.GroupRequest;
import kg.megacom.Students.repositories.GroupRepo;
import kg.megacom.Students.repositories.LessonRepo;
import kg.megacom.Students.services.CourseService;
import kg.megacom.Students.services.GroupService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService {

    private final GroupRepo groupRepo;

    private final CourseService courseService;

    private final LessonRepo lessonRepo;

    public GroupServiceImpl(GroupRepo groupRepo, CourseService courseService, LessonRepo lessonRepo) {
        this.groupRepo = groupRepo;
        this.courseService = courseService;
        this.lessonRepo = lessonRepo;
    }

    @Override
    public Group createGroup(Group group) {return  groupRepo.save(group);}

    private List<Date> getLessonsDates(List<Day> days, int duration, Date startDate){
        List<Date> dates=new ArrayList<>();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(startDate);

        //days=[MONDAY, WEDNESDAY, FRIDAY]
        //[2, 4, 6]
        //[]

        for (int i=0; i<duration;){

            long count=days
                    .stream()
                    .map(x->x.getDayValue())
                    .filter(x-> x==calendar.get(Calendar.DAY_OF_WEEK))
                    .count();

            if(count==1){
                i++;
                dates.add(calendar.getTime());
            }

            calendar.add(Calendar.DAY_OF_MONTH, 1);

        }
        return dates;

    }

    @Override
    public Group create(GroupRequest groupRequest) {

        Course course=courseService.findById(groupRequest.getCourseId());

        if(course.getDuration()<=0)
            throw new RuntimeException("Длительность не может быть меньше или равна нулю!");

        List<Date> lessonsDates=getLessonsDates(groupRequest.getDays(), course.getDuration(), groupRequest.getStartDate());

        Date maxDate=lessonsDates.get(lessonsDates.size()-1);
        Date minDate=lessonsDates.get(0);

        Group group=new Group();
        group.setCourse(course);
        group.setStartDate(minDate);
        group.setEndDate(maxDate);
        group.setName(groupRequest.getGroupTitle());

        group=groupRepo.save(group);

        Group finalGroup=group;

        List<Lesson> lessons=lessonsDates
                .stream()
                .map(x->{
                    Lesson lesson=new Lesson();
                    lesson.setDay(x);
                    lesson.setGroup(finalGroup);
                    return lesson;
                })
                .collect(Collectors.toList());
        lessonRepo.saveAll(lessons);

        return group;
    }

    @Override
    public Group findById(Long id) {
        return groupRepo.findById(id).orElseThrow(()-> new RuntimeException("Группа не найдена!"));
    }
}
