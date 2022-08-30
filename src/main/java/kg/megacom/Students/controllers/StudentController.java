package kg.megacom.Students.controllers;

import kg.megacom.Students.models.Dto.StudentDto;
import kg.megacom.Students.models.Student;
import kg.megacom.Students.services.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/createStudent")

    public StudentDto createStudent(@RequestBody Student student){return studentService.createStudent(student);}

    @GetMapping("/findAll")
    public List<StudentDto>findAll(){
        return studentService.findAll();
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestParam Long id, @RequestParam String title){
        return studentService.update(id, title);
    }

    @DeleteMapping("/delete")
    void delete(@RequestParam Long id){
        studentService.delete(id);
    }

    @GetMapping("/findAllNotDeleted")
    public List<Student> findAllNitDeleted(){return studentService.findAllNotDeleted();}
}
