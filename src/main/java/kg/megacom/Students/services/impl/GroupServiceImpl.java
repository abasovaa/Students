package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Course;
import kg.megacom.Students.mappers.GroupMapper;
import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Lesson;
import kg.megacom.Students.models.enums.Day;
import kg.megacom.Students.models.requests.GroupRequest;
import kg.megacom.Students.repositories.GroupRepo;
import kg.megacom.Students.repositories.LessonRepo;
import kg.megacom.Students.services.CourseService;
import kg.megacom.Students.services.GroupService;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService {
        private final GroupRepo groupRepo;

        //private final GroupMapper groupMapper;

        private final CourseService courseService;

        private final LessonRepo lessonRepo;

    public GroupServiceImpl(GroupRepo groupRepo, GroupMapper groupMapper, CourseService courseService, LessonRepo lessonRepo){
        this.groupRepo=groupRepo;
        //this.groupMapper = groupMapper;
        this.courseService = courseService;
        this.lessonRepo = lessonRepo;
    }

       /* @Override
        public GroupDto createGroup(Group group) {
           Group newGroup=new Group();
            newGroup.setId(group.getId());
            newGroup.setName(group.getName());
            newGroup.setStartDate(group.getStartDate());
            newGroup.setEndDate(group.getEndDate());
            newGroup.setCourse(group.getCourse());
            newGroup.setTeacher(group.getTeacher());

            groupRepo.save(group);

            return groupMapper.toDto(group);
    }*/

    private List<Date> getLessonsDates(List<Day> days, int duration, Date startDate){
        List<Date> dates=new ArrayList<>();
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(startDate);

        for (int i=0; i<duration;){
           long count=days
                   .stream()
                   .map(x-> x.getDayValue())
                   .filter(x-> x==calendar.get(Calendar.DAY_OF_WEEK))
                   .count();
            if(count==1){
                i++;
            }
                dates.add(calendar.getTime());

           calendar.add(Calendar.DAY_OF_MONTH, 1);
        }

        return dates;
    }

    /*@Override
    public List<GroupDto> findAll() {

        List<Group> groupList=groupRepo.findAll();

        return groupMapper.toDtoList(groupList);
    }*/

    @Override
    public Group update(Long id, String name) {
        Optional<Group> group=Optional.of(groupRepo.findById(id).get());
        groupRepo.update(id, name);

        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Group create(GroupRequest groupRequest) {
        //GroupRequest(groupTitle=Java 18:00, courseId=1, startDate=Thu Sep 01 06:00:00 KGT 2022, days=[MONDAY, WEDNESDAY, FRIDAY])

        //Найти курс по ID
        //duration не должен быть пустой или меньше или равно 0
        //Получить список дат уроков
        //insert into groups
        //insert into lessons


        Course course=courseService.findById(groupRequest.getCourseId());
        if (course.getDuration()<=0)
            throw new RuntimeException("Длительность не может быть меньше или равна нулю!");

        List<Date> lessonsDates=getLessonsDates(groupRequest.getDays(), course.getDuration(), groupRequest.getStartDate());

        Date maxDate=lessonsDates
                .stream()
                .max(Date::compareTo)
                .get();

        Group group=new Group();
        group.setCourse(course);
        group.setStartDate(groupRequest.getStartDate());
        group.setEndDate(maxDate);
        group.setName(groupRequest.getGroupTitle());

        group=groupRepo.save(group);

        Group finalGroup = group;
        List<Lesson> lessons=lessonsDates
                .stream()
                .map(x->{
                    Lesson lesson=new Lesson();
                    lesson.setDay(x);
                    lesson.setGroup(finalGroup);
                    return lesson;
                }).collect(Collectors.toList());

        lessonRepo.saveAll(lessons);

        return group;
    }
}
