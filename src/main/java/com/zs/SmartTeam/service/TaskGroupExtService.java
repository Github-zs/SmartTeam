package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.TaskGroupExtModel;

public interface TaskGroupExtService {
    Long selectCountByGroup(Long groupBelonged);

    int insert(TaskGroupExtModel taskGroupExtModel);

    int updateByPrimaryKey(TaskGroupExtModel taskGroupExtModel);
}
