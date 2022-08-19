package kg.megacom.Students.repositories;

import kg.megacom.Students.models.StudentGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentGroupRepo extends JpaRepository<StudentGroup, Long> {
}
