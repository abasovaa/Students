package kg.megacom.Students.controllers;

import kg.megacom.Students.models.Dto.LessonDto;
import kg.megacom.Students.models.Lesson;
import kg.megacom.Students.services.LessonService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/lesson")

public class LessonController {

    /*private final LessonService lessonService;

    public LessonController(LessonService lessonService) {
        this.lessonService = lessonService;
    }

        @PostMapping("/createLesson")

                public LessonDto createLesson(@RequestBody Lesson lesson){
            return lessonService.createLesson(lesson);
        }

        @GetMapping("/findAll")
    public List<LessonDto>findAll(){
        return lessonService.findAll();
        }

        @PutMapping("/update")
    public Lesson updateLesson(@RequestParam long id, @RequestParam Date day){
        return lessonService.update(id, day);
        }

        @DeleteMapping("/delete")
    void delete(@RequestParam Long id){lessonService.delete(id);}*/
    }
