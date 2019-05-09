package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.DesignManagementModelMapper;
import com.zs.SmartTeam.model.DesignManagementModel;
import com.zs.SmartTeam.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignServiceImpl implements DesignService {

    @Autowired
    private DesignManagementModelMapper mapper;

    @Override
    public List<DesignManagementModel> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public DesignManagementModel selectById(Long designId) {
        return mapper.selectByPrimaryKey(designId);
    }

    @Override
    public int insert(DesignManagementModel designManagementModel) {
        return mapper.insert(designManagementModel);
    }

    @Override
    public int delete(Long designId) {
        return mapper.deleteByPrimaryKey(designId);
    }

    @Override
    public int updateById(DesignManagementModel designManagementModel) {
        return mapper.updateByPrimaryKey(designManagementModel);
    }

}
