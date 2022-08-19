package kg.megacom.Students.models;

import kg.megacom.Students.enums.PaymentStatusEnum;
import kg.megacom.Students.enums.StudentGroupEnum;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;


@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name="student_groups")
public class StudentGroup {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    String startDate;
    String endDate;

    @ManyToOne
    @JoinColumn (name = "student_id")
    Student student;

    @ManyToOne
    @JoinColumn(name="group_id")
    Group group;

    @Enumerated(value = EnumType.STRING)
    StudentGroupEnum status;
}
