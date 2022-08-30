package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Teacher;
import kg.megacom.Students.repositories.TeacherRepo;
import kg.megacom.Students.services.TeacherService;
import org.springframework.stereotype.Service;

@Service

public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepo teacherRepo;

    public TeacherServiceImpl(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @Override
    public Teacher createTeacher(Teacher teacher) {
        return teacherRepo.save(teacher);
    }
}
