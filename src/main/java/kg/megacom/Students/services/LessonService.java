package kg.megacom.Students.services;

import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Lesson;

import java.util.List;

public interface LessonService {

    List<Lesson> findLessonByGroup(Group group);
}
