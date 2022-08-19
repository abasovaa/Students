package kg.megacom.Students.Dto;

import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Student;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
    @FieldDefaults(level = AccessLevel.PRIVATE)

    public class StudentGroupDto {

        long id;
        String startDate;
        String endDate;
        boolean statusIsActive;

        List<Student> students;
        List<Group> groups;
    }
