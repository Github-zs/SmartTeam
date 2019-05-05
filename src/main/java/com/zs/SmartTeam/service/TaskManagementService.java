package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.TaskGroupExtModel;
import com.zs.SmartTeam.model.TaskManagementModel;

public interface TaskManagementService {

    int insert(TaskManagementModel taskManagementModel);

    int updateTaskExt(TaskGroupExtModel taskGroupExtModel);

    TaskManagementModel selectById(Long taskId);
}
