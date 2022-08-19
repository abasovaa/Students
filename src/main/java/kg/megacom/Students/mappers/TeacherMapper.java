package kg.megacom.Students.mappers;
import kg.megacom.Students.Dto.TeacherDto;
import kg.megacom.Students.models.Teacher;

import java.util.List;

public interface TeacherMapper {

    Teacher fromDto(TeacherDto teacherDto);
    TeacherDto toDto(Teacher teacher);

    List<Teacher> fromDtos(List<TeacherDto> teacherDto);
    List<TeacherDto> toDtos(List<Teacher> teachers);
}
