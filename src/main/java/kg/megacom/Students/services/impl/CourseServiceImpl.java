package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Dto.CourseDto;
import kg.megacom.Students.mappers.CourseMapper;
import kg.megacom.Students.models.Course;
import kg.megacom.Students.repositories.CourseRepo;
import kg.megacom.Students.services.CourseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;

    private final CourseMapper courseMapper;

    public CourseServiceImpl(CourseRepo courseRepo, CourseMapper courseMapper){
        this.courseRepo=courseRepo;
        this.courseMapper = courseMapper;
    }

    @Override
    public CourseDto createCourse(Course course) {
  /*      Course newCourse=new Course();
        newCourse.setId(course.getId());
        newCourse.setTitle(course.getTitle());
        newCourse.setPrice(course.getPrice());
        newCourse.setDuration(course.getDuration());
        */

        courseRepo.save(course);

        return courseMapper.toDto(course);
    }

    @Override
    public List<CourseDto> findAll() {

        List<Course> courseList=courseRepo.findAll();

        return courseMapper.toDtoList(courseList);
    }

    @Override
    public Course update(Long id, String title, Double price, Integer duration) {
        Optional<Course> course=Optional.of(courseRepo.findById(id).get());
        course.get().setTitle(title);
        course.get().setPrice(price);
        course.get().setDuration(duration);

        courseRepo.update(id, title, price, duration);
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Course findById(Long id) {

        return courseRepo.findById(id).orElseThrow();
    }
}
