package kg.megacom.Students.controllers;

import kg.megacom.Students.models.Course;
import kg.megacom.Students.services.CourseService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/course")
public class CourseController {

    private final CourseService courseService;


    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/createCourse")

    public Course createCourse(@RequestBody Course course){return courseService.createCourse(course);}
}
