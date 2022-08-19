package kg.megacom.Students.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "groups")

public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;
    String name;
    String startDate;
    String endDate;


    @ManyToOne
    @JoinColumn (name = "course_id")
    Course course;

    @ManyToOne
    @JoinColumn (name = "teacher_id")
    Teacher teacher;
}

