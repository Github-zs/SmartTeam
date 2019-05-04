package com.zs.SmartTeam.mapper;

import com.zs.SmartTeam.model.NoteManagementModel;
import java.util.List;

public interface NoteManagementModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_management
     *
     * @mbggenerated Sat May 04 21:21:53 CST 2019
     */
    int deleteByPrimaryKey(Long noteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_management
     *
     * @mbggenerated Sat May 04 21:21:53 CST 2019
     */
    int insert(NoteManagementModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_management
     *
     * @mbggenerated Sat May 04 21:21:53 CST 2019
     */
    NoteManagementModel selectByPrimaryKey(Long noteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_management
     *
     * @mbggenerated Sat May 04 21:21:53 CST 2019
     */
    List<com.zs.SmartTeam.model.NoteManagementModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_management
     *
     * @mbggenerated Sat May 04 21:21:53 CST 2019
     */
    int updateByPrimaryKey(NoteManagementModel record);
}
