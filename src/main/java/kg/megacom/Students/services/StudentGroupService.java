package kg.megacom.Students.services;

import kg.megacom.Students.models.StudentGroup;
import org.springframework.http.ResponseEntity;

import java.util.Date;

public interface StudentGroupService {

    ResponseEntity create(Date startDate, Date endDate, Long studentId, Long groupId);

    StudentGroup append(Long studentId, Long groupId);
}
