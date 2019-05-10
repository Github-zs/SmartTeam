package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.UserModelMapper;
import com.zs.SmartTeam.model.UserModel;
import com.zs.SmartTeam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    public UserModelMapper userModelMapper;

    @Override
    public List<UserModel> selectAll() {
        return userModelMapper.selectAll();
    }

    @Override
    public UserModel selectByLoginName(String loginName) {
        return userModelMapper.selectByLoginName(loginName);
    }

    @Override
    public UserModel selectById(Long userId) {
        return userModelMapper.selectByPrimaryKey(userId);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Override
    public int insert(UserModel userModel) {
        BCryptPasswordEncoder encoder = bCryptPasswordEncoder();
        String registerPwd = userModel.getLoginPassword();
        userModel.setLoginPassword(encoder.encode(registerPwd));
        return userModelMapper.insert(userModel);
    }
}
