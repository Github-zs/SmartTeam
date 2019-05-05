package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.TaskGroupExtModel;

import java.util.List;

public interface TaskGroupExtService {
    Long selectCountByGroup(Long groupBelonged);

    int insert(TaskGroupExtModel taskGroupExtModel);

    int updateByPrimaryKey(TaskGroupExtModel taskGroupExtModel);

    List<TaskGroupExtModel> selectAll();
}
