package kg.megacom.Students.controllers;

import kg.megacom.Students.services.StudentGroupService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/api/v1/studentGroup")

public class StudentGroupController {

private final StudentGroupService studentGroupService;

    public StudentGroupController(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @PostMapping("/createStudent")

    public ResponseEntity createStudentGroup(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") Date startDate,
                                             @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd")Date endDate,
                                             @RequestParam Long studentId, @RequestParam Long groupId) {

        return studentGroupService.create(startDate, endDate, studentId, groupId);
    }
}
