package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.common.Utils;
import com.zs.SmartTeam.model.RequirementManagementModel;
import com.zs.SmartTeam.service.RequirementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
public class RequirementController {

    @Autowired
    private RequirementService service;

    @Autowired
    private Utils utils;

    @RequestMapping(value = { "/requirement/getAll" }, method = RequestMethod.GET)
    public List<RequirementManagementModel> getAll() {
        return service.selectAll();
    }

    @RequestMapping(value = { "/requirement/add" }, method = RequestMethod.POST)
    public int insert(HttpServletRequest request, @RequestBody RequirementManagementModel requirementManagementModel) {
        Long requiremtnAuthor = utils.returnLoginUserId(request);
        requirementManagementModel.setRequirementAuthor(requiremtnAuthor);
        return service.insert(requirementManagementModel);
    }

    @RequestMapping(value = { "/requirement/getByAuthor" }, method = RequestMethod.GET)
    public List<RequirementManagementModel> selectByAuthor(HttpServletRequest request) {
        Long requirementAuthor = utils.returnLoginUserId(request);
        return service.selectByAuthor(requirementAuthor);
    }

    @RequestMapping(value = { "/requirement/getById" }, method = RequestMethod.GET)
    public RequirementManagementModel selectById(Long requirementId) {
        return service.selectById(requirementId);
    }

    @RequestMapping(value = { "/requirement/delete" }, method = RequestMethod.DELETE)
    public int delete(Long requirementId) {
        return service.deleteById(requirementId);
    }

    @RequestMapping(value = { "/requirement/update" }, method = RequestMethod.POST)
    public int updateById(@RequestBody RequirementManagementModel requirementManagementModel) {
        requirementManagementModel.setUpdateDate(new Date());
        return service.updateById(requirementManagementModel);
    }
}
