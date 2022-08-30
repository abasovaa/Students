package kg.megacom.Students.controllers;

import kg.megacom.Students.models.Teacher;
import kg.megacom.Students.services.TeacherService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/teacher")

public class TeacherController {

private  final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/createTeacher")
    public Teacher createTeacher(@RequestBody Teacher teacher){ return teacherService.createTeacher(teacher);}
}
