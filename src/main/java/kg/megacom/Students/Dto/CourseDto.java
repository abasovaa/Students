package kg.megacom.Students.Dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


public class CourseDto {

    long id;
    String title;
    double price;
    String duration;

}

