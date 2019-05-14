package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.TaskManagementModelMapper;
import com.zs.SmartTeam.model.GroupModel;
import com.zs.SmartTeam.model.TaskGroupExtModel;
import com.zs.SmartTeam.model.TaskManagementModel;
import com.zs.SmartTeam.service.GroupService;
import com.zs.SmartTeam.service.TaskGroupExtService;
import com.zs.SmartTeam.service.TaskManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

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

    @Autowired
    private GroupService groupService;

    @Override
    public int insert(TaskManagementModel taskManagementModel) {

        taskManagementModel.setCreateDate(new Date());
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
        Long count = taskGroupExtService.selectCountByGroup(extModel.getGroupBelonged());
        if (count == null) {
            count = 0L;
        }
        extModel.setNumericalOrder(count + 1);

        GroupModel groupModel = groupService.selectById(extModel.getGroupBelonged());

        extModel.setTaskUrl(groupModel.getGroupName() + "-" + String.valueOf(count + 1));
        extModel.setTaskBelonged(taskId);

        return taskGroupExtService.updateByPrimaryKey(extModel);
    }

    @Override
    public TaskManagementModel selectById(Long taskId) {
        return mapper.selectByPrimaryKey(taskId);
    }

    @Override
    public List<TaskManagementModel> selectByExecutor(Long userId) {
        return mapper.selectByExecutor(userId);
    }


}
