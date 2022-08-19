package kg.megacom.Students.mappers.impl;
import kg.megacom.Students.Dto.CourseDto;
import kg.megacom.Students.mappers.CourseMapper;
import kg.megacom.Students.models.Course;

import java.util.List;

public class CourseMapperImpl implements CourseMapper {

    @Override
    public Course fromDto(CourseDto courseDto) {

        long id;
        String title;
        double price;
        String duration;


        return null;
    }

    @Override
    public CourseDto toDto(Course course) {
        return null;
    }

    @Override
    public List<Course> fromDtos(List<CourseDto> courseDto) {
        return null;
    }

    @Override
    public List<CourseDto> toDtos(List<Course> courses) {
        return null;
    }
}

