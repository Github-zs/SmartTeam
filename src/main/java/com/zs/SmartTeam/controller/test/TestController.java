package com.zs.SmartTeam.controller.test;


import com.zs.SmartTeam.model.TestModel;
import com.zs.SmartTeam.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/testGetAll", method = RequestMethod.GET)
    public List<TestModel> getAll() {
        return testService.selectAll();
    }
}
