package kg.megacom.Students.mappers;

import kg.megacom.Students.Dto.LessonDto;
import kg.megacom.Students.models.Lesson;

import java.util.List;

public interface LessonMapper {

    Lesson fromDto(LessonDto lessonDto);
    LessonDto toDto(Lesson lesson);

    List<Lesson> fromDtos(List<LessonDto> lessonDto);
    List<LessonDto> toDtos(List<Lesson> lessons);
}

