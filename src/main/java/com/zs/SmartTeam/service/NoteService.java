package com.zs.SmartTeam.service;

import com.zs.SmartTeam.model.NoteManagementModel;

import java.util.List;

public interface NoteService {
    List<NoteManagementModel> selectAll();
}
