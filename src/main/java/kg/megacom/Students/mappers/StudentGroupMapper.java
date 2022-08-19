package kg.megacom.Students.mappers;

import kg.megacom.Students.Dto.StudentGroupDto;
import kg.megacom.Students.models.StudentGroup;

import java.util.List;

public interface StudentGroupMapper {

    StudentGroup fromDto(StudentGroupDto studentGroupDto);
    StudentGroupDto toDto(StudentGroup studentGroup);

    List<StudentGroup> fromDtos(List<StudentGroupDto> studentDto);
    List<StudentGroupDto> toDtos(List<StudentGroup> students);
}
