package kg.megacom.Students.repositories;

import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface LessonRepo extends JpaRepository<Lesson, Long> {

    List<Lesson> findAllByGroupOrderById(Group group);
}
