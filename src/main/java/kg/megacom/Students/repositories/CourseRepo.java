package kg.megacom.Students.repositories;

import kg.megacom.Students.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CourseRepo extends JpaRepository<Course, Long> {
}
