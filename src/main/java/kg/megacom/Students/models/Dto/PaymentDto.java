package kg.megacom.Students.models.Dto;
import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Student;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor

public class PaymentDto {

    long id;
    String paymentDate;
    String surname;
    String title;
    boolean paid;

    List<Student> student;
    List<Group> groups;

}
