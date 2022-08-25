package kg.megacom.Students.controllers;

import kg.megacom.Students.models.Dto.CourseDto;
import kg.megacom.Students.models.Course;
import kg.megacom.Students.services.CourseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")

public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/createCourse")

    public CourseDto createCourse(@RequestBody Course course){

        return courseService.createCourse(course);
    }

    @GetMapping("/findAll")

    public List<CourseDto> findAll(){
        return courseService.findAll();
    }

}
