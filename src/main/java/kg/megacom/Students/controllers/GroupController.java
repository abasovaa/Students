package kg.megacom.Students.controllers;

import kg.megacom.Students.models.Dto.GroupDto;
import kg.megacom.Students.models.Group;
import kg.megacom.Students.models.requests.GroupRequest;
import kg.megacom.Students.services.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/group")

public class GroupController {
    private final GroupService groupService;

    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

 /*   @PostMapping("/createGroup")

    public GroupDto createGroup(@RequestBody Group group) {
        return groupService.createGroup(group);
    }
*/
    @PostMapping("/create")
    public Group create(@RequestBody GroupRequest groupRequest){
        return groupService.create(groupRequest);

    }
 /* @GetMapping("/findAll")

    public List<GroupDto> findAll(){
        return groupService.findAll();
    }*/

    @PutMapping("/update")
    public Group updateGroup(@RequestParam Long id, @RequestParam String name){
        return groupService.update(id,name);
    }

    @DeleteMapping("/delete")
    void delete(@RequestParam Long id){ groupService.delete(id);}

    }


