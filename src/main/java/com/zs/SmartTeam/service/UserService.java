package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> selectAll();

    UserModel selectByLoginName(String loginName);

    UserModel selectById(Long userId);

    int insert(UserModel userModel) throws Exception;

    int resetPassword(UserModel userModel);

    Boolean checkOldPassword(Long userId, String oldPassword) throws Exception;
}
