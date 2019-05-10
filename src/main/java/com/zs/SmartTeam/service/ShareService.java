package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.ShareManagementModel;

import java.util.List;

public interface ShareService {
    List<ShareManagementModel> selectAll();

    ShareManagementModel selectById(Long shareId);

    int insert(ShareManagementModel shareManagementModel);

    int updateById(ShareManagementModel shareManagementModel);

    int deleteById(Long shareId);
}
