package kg.megacom.Students.services.impl;

import kg.megacom.Students.mappers.StudentMapper;
import kg.megacom.Students.models.Dto.StudentDto;
import kg.megacom.Students.models.Student;
import kg.megacom.Students.repositories.StudentRepo;
import kg.megacom.Students.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentServiceImpl implements StudentService {

    private  final StudentRepo studentRepo;

    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentRepo studentRepo, StudentMapper studentMapper) {
        this.studentRepo = studentRepo;
        this.studentMapper = studentMapper;
    }

    @Override
    public StudentDto createStudent(Student student) {
        studentRepo.save(student);
    return studentMapper.toDto(student);
    }

    @Override
    public List<StudentDto> findAll() {
        List<Student> studentList=studentRepo.findAll();

        return studentMapper.toDtoList(studentList);
    }

    @Override
    public Student update(Long id, String title) {
        studentRepo.update(id, title);
        return studentRepo.findById(id).get();
    }

    @Override
    public Student delete(Long id) {

        Student student=studentRepo.findById(id).get();
        student.setDeleted(true);
        studentRepo.save(student);

        return studentRepo.findById(id).get();
    }

    @Override
    public List<Student> findAllNotDeleted() {
        return studentRepo.findAllByIsDeletedIsFalse();
    }

    @Override
    public Student findById(Long id) {
        return studentRepo.findById(id).orElseThrow(()->new RuntimeException("Студент не найден!"));
    }
}
