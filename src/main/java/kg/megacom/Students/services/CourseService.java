package kg.megacom.Students.services;

import kg.megacom.Students.models.Course;

public interface CourseService {

    Course createCourse(Course course);

    Course findById(Long id);
}
