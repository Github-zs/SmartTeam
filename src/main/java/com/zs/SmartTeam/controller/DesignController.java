package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.model.DesignManagementModel;
import com.zs.SmartTeam.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DesignController {

    @Autowired
    private DesignService service;

    @RequestMapping(value = { "/design/getAll" }, method = RequestMethod.GET)
    public List<DesignManagementModel> getAll() {
        return service.selectAll();
    }

    @RequestMapping(value = { "/design/add" }, method = RequestMethod.POST)
    public int insert(@RequestBody DesignManagementModel designManagementModel) {
        return service.insert(designManagementModel);
    }
}
