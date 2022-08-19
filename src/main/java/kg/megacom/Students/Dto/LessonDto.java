package kg.megacom.Students.Dto;

import kg.megacom.Students.models.Group;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class LessonDto {

    long id;
    Date day;

    List<Group> groups;
}
