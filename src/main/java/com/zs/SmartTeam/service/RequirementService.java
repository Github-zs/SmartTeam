package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.RequirementManagementModel;

import java.util.List;

public interface RequirementService {
    List<RequirementManagementModel> selectAll();

    RequirementManagementModel selectById(Long requirementId);

    int insert(RequirementManagementModel requirementManagementModel);

    int updateById(RequirementManagementModel requirementManagementModel);

    int deleteById(Long requirementId);
}
