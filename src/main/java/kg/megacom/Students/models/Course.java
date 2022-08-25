package kg.megacom.Students.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "courses")


public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    String title;
    double price;
    int duration;


}
