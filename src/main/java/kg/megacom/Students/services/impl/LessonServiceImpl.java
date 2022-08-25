package kg.megacom.Students.services.impl;

import kg.megacom.Students.models.Dto.LessonDto;
import kg.megacom.Students.mappers.LessonMapper;
import kg.megacom.Students.models.Lesson;
import kg.megacom.Students.repositories.LessonRepo;
import kg.megacom.Students.services.LessonService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class LessonServiceImpl implements LessonService {

    private final LessonRepo lessonRepo;

    private final LessonMapper lessonMapper;

    public LessonServiceImpl(LessonRepo lessonRepo, LessonMapper lessonMapper) {
        this.lessonRepo = lessonRepo;
        this.lessonMapper = lessonMapper;
    }

    @Override
    public LessonDto createLesson(Lesson lesson) {
        /*Lesson newLesson=new Lesson();
        newLesson.setId(lesson.getId());
        newLesson.setDay(lesson.getDay());
        newLesson.setGroup(lesson.getGroup());*/

        lessonRepo.save(lesson);

        return lessonMapper.toDto(lesson);
    }

    @Override
    public List<LessonDto> findAll() {

        List<Lesson> lessonList=lessonRepo.findAll();


        return lessonMapper.toDtoList(lessonList);
    }

    @Override
    public Lesson update(Long id, Date day) {

        /*Optional<Lesson> lesson=Optional.of(lessonRepo.findById(id).get());
        lesson.get().setDay(day);*/
        lessonRepo.update(id, day);

        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
