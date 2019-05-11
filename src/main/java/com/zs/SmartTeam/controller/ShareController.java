package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.common.Utils;
import com.zs.SmartTeam.model.ShareManagementModel;
import com.zs.SmartTeam.service.ShareService;
import org.omg.PortableServer.LIFESPAN_POLICY_ID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class ShareController {

    @Autowired
    private ShareService service;

    @Autowired
    private Utils utils;

    @RequestMapping(value = { "/share/getAll" }, method = RequestMethod.GET)
    public List<ShareManagementModel> getAll() {
        return service.selectAll();
    }

    @RequestMapping(value = { "/share/add" }, method = RequestMethod.POST)
    public int insert(HttpServletRequest request, @RequestBody  ShareManagementModel shareManagementModel) {
        Long shareAuthor = utils.returnLoginUserId(request);
        shareManagementModel.setShareAuthor(shareAuthor);
        return service.insert(shareManagementModel);
    }

    @RequestMapping(value = { "/share/getByAuthor" }, method = RequestMethod.GET)
    public List<ShareManagementModel> selectByAuthor(HttpServletRequest request) {
        Long shareAuthor = utils.returnLoginUserId(request);
        return service.selectByAuthor(shareAuthor);
    }

    @RequestMapping(value = { "/share/getById" }, method = RequestMethod.GET)
    public ShareManagementModel selectById(Long shareId) {
        return service.selectById(shareId);
    }

    @RequestMapping(value = { "/share/delete" }, method = RequestMethod.DELETE)
    public int delete(Long shareId) {
        return service.deleteById(shareId);
    }
}
