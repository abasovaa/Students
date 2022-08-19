package kg.megacom.Students.Dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class StudentDto {

    long id;
    String name;
    String surname;
    String title;

}
