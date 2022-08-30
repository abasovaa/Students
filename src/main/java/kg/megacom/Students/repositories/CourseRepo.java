package kg.megacom.Students.repositories;

import kg.megacom.Students.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository

public interface CourseRepo extends JpaRepository<Course, Long> {
}
