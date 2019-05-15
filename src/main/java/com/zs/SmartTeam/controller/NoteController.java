package com.zs.SmartTeam.controller;

import com.zs.SmartTeam.common.Utils;
import com.zs.SmartTeam.model.NoteManagementModel;
import com.zs.SmartTeam.model.UserModel;
import com.zs.SmartTeam.service.NoteService;
import com.zs.SmartTeam.service.UserService;
import io.jsonwebtoken.Jwts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.rmi.CORBA.Util;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteService service;

    @Autowired
    private Utils utils;

    @RequestMapping(value = { "/note/selectAll" }, method = RequestMethod.GET)
    public List<NoteManagementModel> selectAll() {
        return service.selectAll();
    }

    @RequestMapping(value = { "/note/add" }, method = RequestMethod.POST)
    public int insert(HttpServletRequest request,  @RequestBody NoteManagementModel noteManagementModel) {
       Long author =  utils.returnLoginUserId(request);

       noteManagementModel.setNoteAuthor(author);

       return service.insert(noteManagementModel);
    }

    @RequestMapping(value = { "/note/selectByAuthor" }, method = RequestMethod.GET)
    public List<NoteManagementModel> selectByAuthor(HttpServletRequest request) {

        Long authorId = utils.returnLoginUserId(request);

        return service.selectByAuthor(authorId);
    }

    @RequestMapping(value = { "/note/selectById" }, method = RequestMethod.GET)
    public NoteManagementModel selectById(Long noteId) {

        return service.selectById(noteId);

    }

    @RequestMapping(value = { "/note/update" }, method = RequestMethod.POST)
    public int update(HttpServletRequest request, @RequestBody NoteManagementModel noteManagementModel) {
        Long authorId = utils.returnLoginUserId(request);

        noteManagementModel.setNoteAuthor(authorId);
        noteManagementModel.setUpdateDate(new Date());

        return service.updateById(noteManagementModel);
    }

    @RequestMapping(value = { "/note/delete" }, method = RequestMethod.DELETE)
    public int delete(Long noteId) {
        return service.deleteById(noteId);
    }
}
