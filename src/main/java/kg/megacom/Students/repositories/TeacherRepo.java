package kg.megacom.Students.repositories;

import jdk.jfr.Label;
import kg.megacom.Students.models.Teacher;
import org.springframework.boot.autoconfigure.graphql.ConditionalOnGraphQlSchema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TeacherRepo extends JpaRepository<Teacher, Long> {
}
