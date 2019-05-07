package com.zs.SmartTeam.controller;


import com.zs.SmartTeam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexerController {

    @Autowired
    private UserService service;

}
