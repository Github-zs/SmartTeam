package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.UserModel;

import java.util.List;

public interface UserService {
    List<UserModel> selectAll();

    UserModel selectByLoginName(String loginName);

    UserModel selectById(Long userId);
}
