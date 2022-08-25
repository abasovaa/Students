package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Dto.StudentDto;
import kg.megacom.Students.mappers.StudentGroupMapper;
import kg.megacom.Students.mappers.StudentMapper;
import kg.megacom.Students.models.Student;
import kg.megacom.Students.repositories.StudentRepo;
import kg.megacom.Students.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    private final StudentMapper studentMapper;

    public StudentServiceImpl(StudentRepo studentRepo, StudentGroupMapper studentGroupMapper, StudentMapper studentMapper) {
        this.studentRepo = studentRepo;
        this.studentMapper = studentMapper;
    }

    @Override
    public StudentDto createStudent(Student student) {
/*
        Student newStudent=new Student();
        newStudent.setId(student.getId());
        newStudent.setName(student.getName());
        newStudent.setSurname(student.getSurname());
        newStudent.setTitle(student.getTitle());*/

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

       /* Optional<Student> student= Optional.of(studentRepo.findById(id).get());
        student.get().setTitle(title);*/
        studentRepo.update(id, title);
        return null;
    }

    @Override
    public void delete(Long id) {

        studentRepo.delete(studentRepo.findById(id).get());
    }
}
