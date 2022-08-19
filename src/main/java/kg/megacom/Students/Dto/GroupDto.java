package kg.megacom.Students.Dto;

import kg.megacom.Students.models.Course;
import kg.megacom.Students.models.Teacher;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class GroupDto {

    long id;
    String name;
    String startDate;
    String endDate;

    List<Course> courses;
    List<Teacher> teachers;
}

