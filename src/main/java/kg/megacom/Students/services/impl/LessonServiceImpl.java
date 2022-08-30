package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.Lesson;
import kg.megacom.Students.repositories.LessonRepo;
import kg.megacom.Students.services.LessonService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService {

    private final LessonRepo lessonRepo;

    public LessonServiceImpl(LessonRepo lessonRepo) {
        this.lessonRepo = lessonRepo;
    }

    @Override
    public List<Lesson> findLessonByGroup(Group group) {
        return lessonRepo.findAllByGroupOrderById(group);
    }
}
