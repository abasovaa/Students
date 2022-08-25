package kg.megacom.Students.controllers;

import kg.megacom.Students.models.Dto.TeacherDto;
import kg.megacom.Students.models.Teacher;
import kg.megacom.Students.services.TeacherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/teacher")

public class TeacherController {

private  final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/createTeacher")

    public TeacherDto createTeacher(@RequestBody Teacher teacher){

        return teacherService.createTeacher(teacher);
    }

    @GetMapping("/findAll")
    public List<TeacherDto>findAll(){
        return teacherService.findAll();

    }

    @GetMapping("/update")
    public Teacher updateTeacher(@RequestParam Long id, @RequestParam String title){
        return teacherService.update(id, title);
    }

    @DeleteMapping("/delete")
    void delete(@RequestParam Long id){
        teacherService.delete(id);
    }
}
