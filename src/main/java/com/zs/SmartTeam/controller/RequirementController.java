package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.model.RequirementManagementModel;
import com.zs.SmartTeam.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RequirementController {

    @Autowired
    private RequirementService service;

    @RequestMapping(value = { "/requirement/getAll" }, method = RequestMethod.GET)
    public List<RequirementManagementModel> getAll() {
        return service.selectAll();
    }

    @RequestMapping(value = { "/requirement/add" }, method = RequestMethod.POST)
    public int insert(@RequestBody RequirementManagementModel requirementManagementModel) {
        return service.insert(requirementManagementModel);
    }
}
