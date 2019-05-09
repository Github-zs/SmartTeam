package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.NoteManagementModelMapper;
import com.zs.SmartTeam.model.NoteManagementModel;
import com.zs.SmartTeam.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteManagementModelMapper mapper;

    @Override
    public List<NoteManagementModel> selectAll() {
        return mapper.selectAll();
    }
}
