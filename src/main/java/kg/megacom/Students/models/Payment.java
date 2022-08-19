package kg.megacom.Students.models;

import kg.megacom.Students.enums.PaymentStatusEnum;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "payments")

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    String paymentDate;
    String surname;
    String title;

    @ManyToOne
    @JoinColumn (name = "student_id")
    Student student;

    @ManyToOne
    @JoinColumn (name = "group_id")
    Group group;


    @Enumerated(value = EnumType.STRING)
    PaymentStatusEnum status;

}



