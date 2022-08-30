package kg.megacom.Students.mappers;

import kg.megacom.Students.models.Dto.StudentDto;
import kg.megacom.Students.models.Student;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class StudentMapper {
    private final ModelMapper modelMapper;

    public Student toEntity(StudentDto studentDto){
        return Objects.isNull(studentDto) ? null : modelMapper.map(studentDto, Student.class);
    }

    public StudentDto toDto(Student student){
        return  Objects.isNull(student) ? null : modelMapper.map(student,StudentDto.class);
    }

    public List<StudentDto> toDtoList(List<Student> studentList) {
        return studentList.stream().map(student -> modelMapper.map(student, StudentDto.class)).collect(Collectors.toList());
    }
}

