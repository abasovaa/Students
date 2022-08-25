package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.enums.StudentEnum;
import kg.megacom.Students.mappers.StudentGroupMapper;
import kg.megacom.Students.models.Student;
import kg.megacom.Students.models.StudentGroup;
import kg.megacom.Students.repositories.GroupRepo;
import kg.megacom.Students.repositories.StudentGroupRepo;
import kg.megacom.Students.repositories.StudentRepo;
import kg.megacom.Students.services.StudentGroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentGroupServiceImpl implements StudentGroupService {

    private final StudentRepo studentRepo;

    private final GroupRepo groupRepo;

    private final StudentGroupRepo studentGroupRepo;


    public StudentGroupServiceImpl(StudentGroupRepo studentGroupRepo, StudentGroupMapper studentGroupMapper, StudentRepo studentRepo, GroupRepo groupRepo) {
        this.studentGroupRepo = studentGroupRepo;
        this.studentRepo = studentRepo;
        this.groupRepo = groupRepo;
    }

    @Override
    public ResponseEntity create(Date startDate, Date endDate, Long studentId, Long groupId) {

        try {
            Student student = studentRepo.findById(studentId).get();
            if (student.isDeleted()) {
                return ResponseEntity.ok("Student is deleted");
            }

            StudentGroup studentGroup = new StudentGroup();
            studentGroup.setStudent(student);
            studentGroup.setGroup(groupRepo.findById(groupId).get());
            studentGroup.setStartDate(startDate);
            studentGroup.setEndDate(endDate);
            studentGroup.setStatus(StudentEnum.STUDIES);
            return ResponseEntity.ok(studentGroupRepo.save(studentGroup));
        } catch (Exception e) {

            return ResponseEntity.ok("Student doesn't exists");
        }
    }
}
