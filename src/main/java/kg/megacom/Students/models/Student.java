package kg.megacom.Students.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "students")

public class Student {

    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    String name;
    String surname;
    String title;
}
