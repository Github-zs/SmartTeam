package com.zs.SmartTeam.mapper;

import com.zs.SmartTeam.model.NoteManagementModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoteManagementModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_management
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    int deleteByPrimaryKey(Long noteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_management
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    int insert(NoteManagementModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_management
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    NoteManagementModel selectByPrimaryKey(Long noteId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_management
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    List<NoteManagementModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table note_management
     *
     * @mbggenerated Fri May 10 04:54:52 CST 2019
     */
    int updateByPrimaryKey(NoteManagementModel record);


    /**
     * select current login user note
     *
     * @param authorId
     * @return
     */
    List<NoteManagementModel> selectByAuthor(Long authorId);
}
