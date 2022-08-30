package kg.megacom.Students.models.Dto;

import kg.megacom.Students.models.Group;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

public class LessonDto {

    long id;
    Date day;

    List<Group> groups;
}
