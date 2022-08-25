package kg.megacom.Students.repositories;

import jdk.jfr.Label;
import kg.megacom.Students.models.Teacher;
import org.springframework.boot.autoconfigure.graphql.ConditionalOnGraphQlSchema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository

public interface TeacherRepo extends JpaRepository<Teacher, Long> {
    @Transactional
    @Modifying (clearAutomatically = true)
    @Query(value="Update teachers set title=?2 where id=?1", nativeQuery = true)
    void update(Long id, String title);


}
