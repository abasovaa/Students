package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Dto.TeacherDto;
import kg.megacom.Students.mappers.TeacherMapper;
import kg.megacom.Students.models.Teacher;
import kg.megacom.Students.repositories.TeacherRepo;
import kg.megacom.Students.services.TeacherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepo teacherRepo;

    private final TeacherMapper teacherMapper;

    public TeacherServiceImpl(TeacherRepo teacherRepo, TeacherMapper teacherMapper) {
       this.teacherRepo = teacherRepo;
        this.teacherMapper = teacherMapper;
    }


    @Override
    public TeacherDto createTeacher(Teacher teacher) {
        /*Teacher newTeacher=new Teacher();
        newTeacher.setId(teacher.getId());
        newTeacher.setName(teacher.getName());
        newTeacher.setSurname(teacher.getSurname());*/

        teacherRepo.save(teacher);

        return teacherMapper.toDto(teacher);
    }

    @Override
    public List<TeacherDto> findAll() {
        List<Teacher> teacherList=teacherRepo.findAll();

        return teacherMapper.toDtoList(teacherList);
    }

    @Override
    public Teacher update(Long id, String title) {
        /*Optional<Teacher> teacher=Optional.of(teacherRepo.findById(id).get());
        teacher.get().setTitle(title);*/

        teacherRepo.update(id,title);
        return null;
    }

    @Override
    public void delete(Long id) {

        teacherRepo.delete(teacherRepo.findById(id).get());
        }
    }

