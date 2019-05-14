package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.common.Utils;
import com.zs.SmartTeam.model.TaskGroupExtModel;
import com.zs.SmartTeam.model.TaskManagementModel;
import com.zs.SmartTeam.service.TaskGroupExtService;
import com.zs.SmartTeam.service.TaskManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class TaskManagementController {

    @Autowired
    private TaskManagementService service;

    @Autowired
    private Utils utils;

    @RequestMapping(value = { "/addTask" }, method = RequestMethod.POST)
    public int insert(HttpServletRequest request,  @RequestBody TaskManagementModel taskManagementModel) throws Exception {
        Long userId = utils.returnLoginUserId(request);
        taskManagementModel.setTaskReporter(userId);
        return service.insert(taskManagementModel);
    }

    @RequestMapping(value = { "/updateTaskExt" }, method = RequestMethod.POST)
    public int updateTaskExt(@RequestBody TaskGroupExtModel taskGroupExtModel) {
        return service.updateTaskExt(taskGroupExtModel);
    }

    @RequestMapping(value = {"/selectTaskById"}, method = RequestMethod.GET)
    public TaskManagementModel selectTaskById(Long taskId) {
        return service.selectById(taskId);
    }

    @RequestMapping(value = { "/task/selectByExecutor" }, method = RequestMethod.GET)
    public List<TaskManagementModel> selectByExecutor(HttpServletRequest request) {

        Long userId = utils.returnLoginUserId(request);

        return service.selectByExecutor(userId);
    }

}
