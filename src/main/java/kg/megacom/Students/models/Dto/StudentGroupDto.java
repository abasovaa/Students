package kg.megacom.Students.models.Dto;

import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Student;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor

    public class StudentGroupDto {

        long id;
        String startDate;
        String endDate;
        boolean statusIsActive;

        List<Student> students;
        List<Group> groups;
    }
