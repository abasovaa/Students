package kg.megacom.Students.mappers;

import kg.megacom.Students.Dto.StudentDto;
import kg.megacom.Students.models.Student;

import java.util.List;

public interface StudentMapper {


        Student fromDto(StudentDto studentDto);
        StudentDto toDto(Student student);

        List<Student> fromDtos(List<StudentDto> studentDto);
        List<StudentDto> toDtos(List<Student> students);
    }

