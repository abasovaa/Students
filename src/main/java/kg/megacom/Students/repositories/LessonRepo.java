package kg.megacom.Students.repositories;

import kg.megacom.Students.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Date;

@Repository

public interface LessonRepo extends JpaRepository<Lesson, Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value="Update lessons set day=?2 where id=?1", nativeQuery = true)
    void update(Long id, Date day);
}
