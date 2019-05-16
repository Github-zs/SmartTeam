package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.common.Utils;
import com.zs.SmartTeam.model.DesignManagementModel;
import com.zs.SmartTeam.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@RestController
public class DesignController {

    @Autowired
    private DesignService service;

    @Autowired
    private Utils utils;

    @RequestMapping(value = { "/design/getAll" }, method = RequestMethod.GET)
    public List<DesignManagementModel> getAll() {
        return service.selectAll();
    }

    @RequestMapping(value = { "/design/add" }, method = RequestMethod.POST)
    public int insert(HttpServletRequest request, @RequestBody DesignManagementModel designManagementModel) {
        Long designAuthor = utils.returnLoginUserId(request);
        designManagementModel.setDesignAuthor(designAuthor);
        return service.insert(designManagementModel);
    }

    @RequestMapping(value = { "/design/getByAuthor" }, method = RequestMethod.GET)
    public List<DesignManagementModel> selectByAuthor(HttpServletRequest request) {
        Long designAuthor = utils.returnLoginUserId(request);
        return service.selectByAuthor(designAuthor);
    }

    @RequestMapping(value = { "/design/getById" }, method = RequestMethod.GET)
    public DesignManagementModel selectById(Long designId) {
        return service.selectById(designId);
    }

    @RequestMapping(value = { "/design/delete" }, method = RequestMethod.DELETE)
    public int delete(Long designId) {
        return service.delete(designId);
    }

    @RequestMapping(value = { "/design/update" }, method = RequestMethod.POST)
    public int updateById(@RequestBody DesignManagementModel designManagementModel) {
        designManagementModel.setUpdateDate(new Date());
        return service.updateById(designManagementModel);
    }
}
