package kg.megacom.Students.models;

import kg.megacom.Students.models.enums.StudentEnum;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="student_groups")
public class StudentGroup {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    Date startDate;
    Date endDate;

    @ManyToOne
    @JoinColumn (name = "student_id")
    Student student;

    @ManyToOne
    @JoinColumn(name="group_id")
    Group group;

    @Enumerated(value = EnumType.STRING)
    StudentEnum status;
}
