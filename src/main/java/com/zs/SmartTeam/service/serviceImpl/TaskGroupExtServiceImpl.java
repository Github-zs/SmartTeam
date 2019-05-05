package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.TaskGroupExtModelMapper;
import com.zs.SmartTeam.model.TaskGroupExtModel;
import com.zs.SmartTeam.service.TaskGroupExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskGroupExtServiceImpl implements TaskGroupExtService {

    @Autowired
    private TaskGroupExtModelMapper taskGroupExtModelMapper;

    @Override
    public Long selectCountByGroup(Long groupBelonged) {
        return taskGroupExtModelMapper.selectCountByGroup(groupBelonged);
    }

    @Override
    public int insert(TaskGroupExtModel taskGroupExtModel) {
        return taskGroupExtModelMapper.insert(taskGroupExtModel);
    }

    @Override
    public int updateByPrimaryKey(TaskGroupExtModel taskGroupExtModel) {
        return taskGroupExtModelMapper.updateByPrimaryKey(taskGroupExtModel);
    }

    @Override
    public List<TaskGroupExtModel> selectAll() {
        return taskGroupExtModelMapper.selectAll();
    }
}
