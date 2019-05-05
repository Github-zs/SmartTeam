package com.zs.SmartTeam.controller;


import com.zs.SmartTeam.model.GroupModel;
import com.zs.SmartTeam.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroupController {

    @Autowired
    private GroupService groupService;

    @RequestMapping(value = {"/selectAllGroup"}, method = RequestMethod.GET)
    public List<GroupModel> selectAllGroup() {
        return groupService.selectAll();
    }

    @RequestMapping(value = {"/selectById"}, method = RequestMethod.GET)
    public GroupModel selectById(Long groupId) {
        return groupService.selectById(groupId);
    }
}
