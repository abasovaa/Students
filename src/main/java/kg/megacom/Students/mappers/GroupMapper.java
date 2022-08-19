package kg.megacom.Students.mappers;

import kg.megacom.Students.Dto.GroupDto;
import kg.megacom.Students.models.Group;

import java.util.List;

public interface GroupMapper {


    Group fromDto(GroupDto groupDto);
    GroupDto toDto(Group group);

    List<Group> fromDtos(List<GroupDto> groupDto);
    List<GroupDto> toDtos(List<Group> groups);
}

