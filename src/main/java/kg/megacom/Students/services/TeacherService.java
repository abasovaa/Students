package kg.megacom.Students.services;

import kg.megacom.Students.models.Dto.TeacherDto;
import kg.megacom.Students.models.Teacher;

import java.util.List;

public interface TeacherService {

    TeacherDto createTeacher(Teacher teacher);

    List<TeacherDto> findAll();

    Teacher update(Long id, String title);

    void delete(Long id);

}
