package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.model.TaskGroupExtModel;
import com.zs.SmartTeam.model.TaskManagementModel;
import com.zs.SmartTeam.service.TaskGroupExtService;
import com.zs.SmartTeam.service.TaskManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskManagementController {

    @Autowired
    private TaskManagementService service;

    @RequestMapping(value = { "/addTask" }, method = RequestMethod.POST)
    public int insert(@RequestBody TaskManagementModel taskManagementModel) throws Exception {
        return service.insert(taskManagementModel);
    }

    @RequestMapping(value = { "/updateTaskExt" }, method = RequestMethod.POST)
    public int updateTaskExt(@RequestBody TaskGroupExtModel taskGroupExtModel) {
        return service.updateTaskExt(taskGroupExtModel);
    }


}
