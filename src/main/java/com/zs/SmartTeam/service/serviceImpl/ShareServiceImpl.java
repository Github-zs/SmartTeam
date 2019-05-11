package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.ShareManagementModelMapper;
import com.zs.SmartTeam.model.ShareManagementModel;
import com.zs.SmartTeam.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ShareServiceImpl implements ShareService {

    @Autowired
    private ShareManagementModelMapper mapper;

    @Override
    public List<ShareManagementModel> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public ShareManagementModel selectById(Long shareId) {
        return mapper.selectByPrimaryKey(shareId);
    }

    @Override
    public int insert(ShareManagementModel shareManagementModel) {
        shareManagementModel.setCreateDate(new Date());
        return mapper.insert(shareManagementModel);
    }

    @Override
    public int updateById(ShareManagementModel shareManagementModel) {
        return mapper.updateByPrimaryKey(shareManagementModel);
    }

    @Override
    public int deleteById(Long shareId) {
        return mapper.deleteByPrimaryKey(shareId);
    }

    @Override
    public List<ShareManagementModel> selectByAuthor(Long shareAuthor) {
        return mapper.selectByAuthor(shareAuthor);
    }
}
