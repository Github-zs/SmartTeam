package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.UserRoleHrefModelMapper;
import com.zs.SmartTeam.service.UserRoleHrefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleHrefServiceImpl implements UserRoleHrefService {

    @Autowired
    private UserRoleHrefModelMapper mapper;

    @Override
    public List<String> selectRoleByLoginName(String userLoginName) {
        return mapper.selectRoleByLoginName(userLoginName);
    }
}
