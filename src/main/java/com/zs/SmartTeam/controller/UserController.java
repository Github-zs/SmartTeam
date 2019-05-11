package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.model.UserModel;
import com.zs.SmartTeam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = { "/userGetAll" }, method = RequestMethod.GET)
    public List<UserModel> selectAll() {
        return userService.selectAll();
    }

    @RequestMapping(value = { "/userGetByLoginName" }, method = RequestMethod.GET)
    public UserModel selectByLoginName(String loginName) {
        return userService.selectByLoginName(loginName);
    }

    @RequestMapping(value = { "/getUserById" }, method = RequestMethod.GET)
    public UserModel selectUserById(Long userId) {
        return userService.selectById(userId);
    }

    @RequestMapping(value = { "/user/register" }, method = RequestMethod.POST)
    public int insert(@RequestBody  UserModel userModel) throws Exception {
        return userService.insert(userModel);
    }
}
