package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.RequirementManagementModelMapper;
import com.zs.SmartTeam.model.RequirementManagementModel;
import com.zs.SmartTeam.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class RequirementServiceImpl implements RequirementService {

    @Autowired
    private RequirementManagementModelMapper mapper;

    @Override
    public List<RequirementManagementModel> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public RequirementManagementModel selectById(Long requirementId) {
        return mapper.selectByPrimaryKey(requirementId);
    }

    @Override
    public int insert(RequirementManagementModel requirementManagementModel) {
        requirementManagementModel.setCreateDate(new Date());
        return mapper.insert(requirementManagementModel);
    }

    @Override
    public int updateById(RequirementManagementModel requirementManagementModel) {
        return mapper.updateByPrimaryKey(requirementManagementModel);
    }

    @Override
    public int deleteById(Long requirementId) {
        return mapper.deleteByPrimaryKey(requirementId);
    }

    @Override
    public List<RequirementManagementModel> selectByAuthor(Long requirementAuthor) {
        return mapper.selectByAuthor(requirementAuthor);
    }
}
