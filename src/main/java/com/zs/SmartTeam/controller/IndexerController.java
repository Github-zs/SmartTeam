package com.zs.SmartTeam.controller;


import com.zs.SmartTeam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class IndexerController {

    @Autowired
    private UserService service;

    @RequestMapping(value = { "/user" }, method = RequestMethod.GET)
    public Principal user(Principal user) {
        return user;
    }

}
