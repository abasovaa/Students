package kg.megacom.Students.services;

import kg.megacom.Students.models.Dto.CourseDto;
import kg.megacom.Students.models.Course;

import java.util.List;

public interface CourseService {

    CourseDto createCourse(Course course);

    List<CourseDto> findAll();

    Course update(Long id,String title, Double price,Integer duration);

    void delete(Long id);

    Course findById(Long id);
}
