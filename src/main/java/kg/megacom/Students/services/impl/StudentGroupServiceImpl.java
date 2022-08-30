package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Payment;
import kg.megacom.Students.models.Student;
import kg.megacom.Students.models.StudentGroup;
import kg.megacom.Students.models.enums.StudentEnum;
import kg.megacom.Students.repositories.StudentGroupRepo;
import kg.megacom.Students.services.GroupService;
import kg.megacom.Students.services.PaymentService;
import kg.megacom.Students.services.StudentGroupService;
import kg.megacom.Students.services.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service

public class StudentGroupServiceImpl implements StudentGroupService {

    private final StudentService studentService;
    private final GroupService groupService;
    private final StudentGroupRepo studentGroupRepo;
    private final PaymentService paymentService;

    public StudentGroupServiceImpl(StudentService studentService, GroupService groupService, StudentGroupRepo studentGroupRepo, PaymentService paymentService) {
        this.studentService = studentService;
        this.groupService = groupService;
        this.studentGroupRepo = studentGroupRepo;
        this.paymentService = paymentService;
    }

    @Override
    public ResponseEntity create(Date startDate, Date endDate, Long studentId, Long groupId) {
        return null;
    }

    @Override
    public StudentGroup append(Long studentId, Long groupId) {

        Student student = studentService.findById(studentId);
        Group group = groupService.findById(groupId);
        student.setName("qwerty");

        if (group.getEndDate().compareTo(new Date()) <= 0)
            throw new RuntimeException("Группа уже завершила обучение!");

        StudentGroup studentGroup = studentGroupRepo.findByStudentAndGroup(student, group);

        if (studentGroup == null) {
            studentGroup = new StudentGroup();
            studentGroup.setStatus(StudentEnum.STUDIES);
            studentGroup.setStartDate(new Date());
            studentGroup.setStudent(student);

            studentGroup = studentGroupRepo.save(studentGroup);
            List<Payment> payments= paymentService.setPayments(student, group);

            System.out.println(payments);
        }else{
            if(studentGroup.getStatus().equals(StudentEnum.STUDIES))
                throw new RuntimeException("Студент уже в группе!");
        else {
                studentGroup.setStatus(StudentEnum.STUDIES);
                studentGroupRepo.save(studentGroup);
            }
        }

        return studentGroup;
    }
}
