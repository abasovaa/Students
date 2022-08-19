package kg.megacom.Students.controllers;

import kg.megacom.Students.models.Student;
import kg.megacom.Students.services.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")

    public Student createStudent(@RequestBody Student student){

        return studentService.createStudent(student);
    }
}
