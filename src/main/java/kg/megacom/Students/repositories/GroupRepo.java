package kg.megacom.Students.repositories;

import kg.megacom.Students.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GroupRepo extends JpaRepository<Group, Long> {
}
