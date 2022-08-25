package kg.megacom.Students.models.Dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;


@Data

@AllArgsConstructor
@NoArgsConstructor


public class CourseDto {

    long id;
    String title;
    double price;
    String duration;

}

