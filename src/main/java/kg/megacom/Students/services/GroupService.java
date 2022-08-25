package kg.megacom.Students.services;

import kg.megacom.Students.models.Dto.GroupDto;
import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.requests.GroupRequest;

import java.util.List;

public interface GroupService {

/*    GroupDto createGroup(Group group);

    List<GroupDto> findAll();*/

    Group update(Long id, String name);

    void delete(Long id);

    Group create(GroupRequest groupRequest);

}
