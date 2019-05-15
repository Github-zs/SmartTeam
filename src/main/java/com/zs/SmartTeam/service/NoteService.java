package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.NoteManagementModel;

import java.util.List;

public interface NoteService {
    List<NoteManagementModel> selectAll();

    int insert(NoteManagementModel noteManagementModel);

    List<NoteManagementModel> selectByAuthor(Long authorId);

    int deleteById(Long noteId);

    NoteManagementModel selectById(Long noteId);

    int updateById(NoteManagementModel noteManagementModel);
}
