package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.TaskGroupExtModelMapper;
import com.zs.SmartTeam.service.TaskGroupExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskGroupExtServiceImpl implements TaskGroupExtService {

    @Autowired
    private TaskGroupExtModelMapper taskGroupExtModelMapper;

    @Override
    public Long selectCountByGroup(Long groupBelonged) {
        return taskGroupExtModelMapper.selectCountByGroup(groupBelonged);
    }
}
