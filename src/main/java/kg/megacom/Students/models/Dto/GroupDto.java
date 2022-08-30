package kg.megacom.Students.models.Dto;

import kg.megacom.Students.models.Course;
import kg.megacom.Students.models.Teacher;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

public class GroupDto {

    long id;
    String name;
    String startDate;
    String endDate;
    CourseDto courses;
    TeacherDto teachers;
}

