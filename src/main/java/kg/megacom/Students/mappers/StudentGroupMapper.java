package kg.megacom.Students.mappers;

import kg.megacom.Students.models.Dto.StudentGroupDto;
import kg.megacom.Students.models.StudentGroup;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@RequiredArgsConstructor
public class StudentGroupMapper {

   private final ModelMapper modelMapper;

   public StudentGroup toEntity(StudentGroupDto studentGroupDto){
       return Objects.isNull(studentGroupDto)? null : modelMapper.map(studentGroupDto,StudentGroup.class);

    }

    public StudentGroupDto toDto(StudentGroup studentGroup){
        return Objects.isNull(studentGroup)? null : modelMapper.map(studentGroup,StudentGroupDto.class);

    }

}
