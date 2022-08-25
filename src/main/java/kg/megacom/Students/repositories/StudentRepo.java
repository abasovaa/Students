package kg.megacom.Students.repositories;

import kg.megacom.Students.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;

import javax.transaction.Transactional;
import java.util.List;

@Repository

public interface StudentRepo extends JpaRepository<Student, Long> {

    @Transactional
@Modifying(clearAutomatically = true)
@Query(value = "Update students set title=?2 where id=?1", nativeQuery = true)
   void update(Long id, String title);

}


