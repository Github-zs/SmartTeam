package com.zs.SmartTeam.service.serviceImpl;

import com.zs.SmartTeam.mapper.NoteManagementModelMapper;
import com.zs.SmartTeam.model.NoteManagementModel;
import com.zs.SmartTeam.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteManagementModelMapper mapper;

    @Override
    public List<NoteManagementModel> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public int insert(NoteManagementModel noteManagementModel) {
        noteManagementModel.setCreateDate(new Date());
        return mapper.insert(noteManagementModel);
    }

    @Override
    public List<NoteManagementModel> selectByAuthor(Long authorId) {
        return mapper.selectByAuthor(authorId);
    }

    @Override
    public int deleteById(Long noteId) {
        return mapper.deleteByPrimaryKey(noteId);
    }

    @Override
    public NoteManagementModel selectById(Long noteId) {
        return mapper.selectByPrimaryKey(noteId);
    }

    @Override
    public int updateById(NoteManagementModel noteManagementModel) {
        return mapper.updateByPrimaryKey(noteManagementModel);
    }
}
