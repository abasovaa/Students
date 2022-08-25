package kg.megacom.Students.services;

import kg.megacom.Students.models.Dto.StudentDto;
import kg.megacom.Students.models.Student;

import java.util.List;

public interface StudentService {

    StudentDto createStudent(Student student);

    List<StudentDto> findAll();

    Student update(Long id, String title);

    void delete(Long id);
}
