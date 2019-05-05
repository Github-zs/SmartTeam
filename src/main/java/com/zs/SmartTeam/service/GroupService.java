package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.GroupModel;

import java.util.List;

public interface GroupService {
    GroupModel selectById(Long groupId);

    List<GroupModel> selectAll();
}
