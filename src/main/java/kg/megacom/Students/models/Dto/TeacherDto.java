package kg.megacom.Students.models.Dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TeacherDto {

        long id;
        String name;
        String surname;
        String title;
    }

