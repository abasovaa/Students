package kg.megacom.Students.mappers;


import kg.megacom.Students.Dto.CourseDto;
import kg.megacom.Students.models.Course;

import java.util.List;

public interface CourseMapper {

    Course fromDto(CourseDto courseDto);
    CourseDto toDto(Course course);

    List<Course> fromDtos(List<CourseDto> courseDto);
    List<CourseDto> toDtos(List<Course> courses);
}

