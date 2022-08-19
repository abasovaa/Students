package kg.megacom.Students.repositories;

import kg.megacom.Students.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentRepo extends JpaRepository<Student, Long> {


}
