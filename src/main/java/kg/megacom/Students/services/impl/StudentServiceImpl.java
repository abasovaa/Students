package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Student;
import kg.megacom.Students.repositories.StudentRepo;
import kg.megacom.Students.services.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student createStudent(Student student) {

        Student newStudent=new Student();
        newStudent.setId(student.getId());
        newStudent.setName(student.getName());
        newStudent.setSurname(student.getSurname());
        newStudent.setTitle(student.getTitle());
        return newStudent;
    }
}
