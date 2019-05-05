package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.GroupModelMapper;
import com.zs.SmartTeam.model.GroupModel;
import com.zs.SmartTeam.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService{

    @Autowired
    private GroupModelMapper groupModelMapper;

    @Override
    public GroupModel selectById(Long groupId) {
        return groupModelMapper.selectByPrimaryKey(groupId);
    }
}
