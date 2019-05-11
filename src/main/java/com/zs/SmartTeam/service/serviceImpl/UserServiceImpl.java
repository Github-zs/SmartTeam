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
    public int insert(UserModel userModel) throws Exception {
        UserModel haveUser = userModelMapper.selectByLoginName(userModel.getLoginName());
        if (haveUser != null) {
            throw new Exception("帐号已存在");
        }
        BCryptPasswordEncoder encoder = bCryptPasswordEncoder();
        String registerPwd = userModel.getLoginPassword();
        userModel.setLoginPassword(encoder.encode(registerPwd));
        return userModelMapper.insert(userModel);
    }

    @Override
    public int resetPassword(UserModel userModel) {

        BCryptPasswordEncoder encoder = bCryptPasswordEncoder();
        String newPassword = userModel.getLoginPassword();
        userModel.setLoginPassword(encoder.encode(newPassword));

        return userModelMapper.resetPassword(userModel);
    }

    @Override
    public Boolean checkOldPassword(Long userId, String oldPassword) throws Exception {
        BCryptPasswordEncoder encoder = bCryptPasswordEncoder();
        String dbPassword = userModelMapper.selectOldPassword(userId);

        return encoder.matches(oldPassword,dbPassword);
    }
}
