package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.service.TaskGroupExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskGroupExtController {

    @Autowired
    private TaskGroupExtService taskGroupExtService;

    @RequestMapping(value = "/selectCountByGroup", method = RequestMethod.GET)
    public Long selectCountByGroup(Long groupBelonged) {
        return taskGroupExtService.selectCountByGroup(groupBelonged);
    }
}
