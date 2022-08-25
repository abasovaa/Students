package kg.megacom.Students.mappers;


import kg.megacom.Students.models.Dto.GroupDto;
import kg.megacom.Students.models.Group;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class GroupMapper {

    private final ModelMapper modelMapper;

    public Group toEntity(GroupDto groupDto) {
        return Objects.isNull(groupDto) ? null : modelMapper.map(groupDto, Group.class);
    }

    public GroupDto toDto(Group group) {
        return Objects.isNull(group) ? null : modelMapper.map(group, GroupDto.class);
    }

    public List<GroupDto> toDtoList(List<Group> groupList) {

        return groupList.stream().map(group -> modelMapper.map(group, GroupDto.class)).collect(Collectors.toList());
    }
}

