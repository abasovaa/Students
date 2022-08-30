package kg.megacom.Students.repositories;

import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Student;
import kg.megacom.Students.models.StudentGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentGroupRepo extends JpaRepository<StudentGroup, Long> {
    StudentGroup findByStudentAndGroup(Student student, Group group);
}
