package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.model.TaskGroupExtModel;
import com.zs.SmartTeam.service.TaskGroupExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskGroupExtController {

    @Autowired
    private TaskGroupExtService taskGroupExtService;

    @RequestMapping(value = "/taskExt/selectCountByGroup", method = RequestMethod.GET)
    public Long selectCountByGroup(Long groupBelonged) {
        return taskGroupExtService.selectCountByGroup(groupBelonged);
    }

    @RequestMapping(value = {"/selectAllTaskUrl"}, method = RequestMethod.GET)
    public List<TaskGroupExtModel> selectAll() {
        return taskGroupExtService.selectAll();
    }

    @RequestMapping(value = { "/selectUrlByTask" }, method = RequestMethod.GET)
    public TaskGroupExtModel selectByExecutor(Long taskId) {
        return taskGroupExtService.selectUrlByTask(taskId);
    }
}
