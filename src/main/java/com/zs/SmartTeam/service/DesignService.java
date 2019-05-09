package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.DesignManagementModel;

import java.util.List;

public interface DesignService {
    List<DesignManagementModel> selectAll();

    DesignManagementModel selectById(Long designId);

    int insert(DesignManagementModel designManagementModel);

    int delete(Long designId);

    int updateById(DesignManagementModel designManagementModel);
}
