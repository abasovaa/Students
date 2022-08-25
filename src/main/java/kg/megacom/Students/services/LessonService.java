package kg.megacom.Students.services;

import kg.megacom.Students.models.Dto.LessonDto;
import kg.megacom.Students.models.Lesson;

import java.util.Date;
import java.util.List;

public interface LessonService {

    LessonDto createLesson(Lesson lesson);

    List<LessonDto> findAll();

    Lesson update(Long id, Date day);

    void delete(Long id);
}
