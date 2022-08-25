package kg.megacom.Students.repositories;

import kg.megacom.Students.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository

public interface GroupRepo extends JpaRepository<Group, Long> {

    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "Update groups set name=?2 where id=?1", nativeQuery = true)
    void update(Long id, String name);
}
