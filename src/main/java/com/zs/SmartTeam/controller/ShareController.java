package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.model.ShareManagementModel;
import com.zs.SmartTeam.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShareController {

    @Autowired
    private ShareService service;

    @RequestMapping(value = { "/share/getAll" }, method = RequestMethod.GET)
    public List<ShareManagementModel> getAll() {
        return service.selectAll();
    }

    @RequestMapping(value = { "/share/add" }, method = RequestMethod.POST)
    public int insert(@RequestBody  ShareManagementModel shareManagementModel) {
        return service.insert(shareManagementModel);
    }
}
