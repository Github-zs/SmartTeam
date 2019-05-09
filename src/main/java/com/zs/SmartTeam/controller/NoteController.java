package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.model.NoteManagementModel;
import com.zs.SmartTeam.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteService service;

    @RequestMapping(value = { "/note/selectAll" }, method = RequestMethod.GET)
    public List<NoteManagementModel> selectAll() {
        return service.selectAll();
    }
}
