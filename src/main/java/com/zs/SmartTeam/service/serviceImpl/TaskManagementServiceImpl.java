package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.TaskManagementModelMapper;
import com.zs.SmartTeam.model.TaskGroupExtModel;
import com.zs.SmartTeam.model.TaskManagementModel;
import com.zs.SmartTeam.service.TaskGroupExtService;
import com.zs.SmartTeam.service.TaskManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TaskManagementServiceImpl implements TaskManagementService {

    public Long taskExtId;

    public Long taskId;

    @Autowired
    private TaskManagementModelMapper mapper;

    @Autowired
    private TaskGroupExtService taskGroupExtService;

    @Autowired
    private TaskGroupExtModel taskGroupExtModel;

    @Override
    public int insert(TaskManagementModel taskManagementModel) {

        taskManagementModel.setCreateDate(new Date());
        taskManagementModel.setTaskReporter(1L);
        taskManagementModel.setTaskStatus("创建");
        int num = mapper.insert(taskManagementModel);

        taskId = taskManagementModel.getTaskId();
        taskGroupExtModel.setTaskBelonged(taskManagementModel.getTaskId());
        taskGroupExtService.insert(taskGroupExtModel);
        taskExtId = taskGroupExtModel.getId();

        return num;
    }

    @Override
    public int updateTaskExt(TaskGroupExtModel extModel) {
        extModel.setId(taskExtId);
        extModel.setNumericalOrder(taskGroupExtService.selectCountByGroup(extModel.getGroupBelonged()) + 1);
        extModel.setTaskUrl(String.valueOf(taskGroupExtService.selectCountByGroup(extModel.getGroupBelonged()) + 1) + extModel.getGroupBelonged());
        extModel.setTaskBelonged(taskId);

        return taskGroupExtService.updateByPrimaryKey(extModel);
    }


}
