package kg.megacom.Students.services;

import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.requests.GroupRequest;

public interface GroupService {

    Group createGroup(Group group);

    Group create(GroupRequest groupRequest);

    Group findById(Long id);
}
