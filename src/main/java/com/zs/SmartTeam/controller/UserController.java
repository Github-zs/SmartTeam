package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.common.Utils;
import com.zs.SmartTeam.model.UserModel;
import com.zs.SmartTeam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Utils utils;

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

    @RequestMapping(value = { "/user/resetPassword" }, method = RequestMethod.POST)
    public int resetPassword(HttpServletRequest request,@RequestBody UserModel userModel) {
        Long userId = utils.returnLoginUserId(request);
        userModel.setUserId(userId);
        return userService.resetPassword(userModel);
    }

    @RequestMapping(value = { "/user/checkOldPassword" }, method = RequestMethod.GET)
    public Boolean selectOldPassword(HttpServletRequest request, String oldPassword) throws Exception {
        Long userId = utils.returnLoginUserId(request);
        return this.userService.checkOldPassword(userId, oldPassword);
    }
}
