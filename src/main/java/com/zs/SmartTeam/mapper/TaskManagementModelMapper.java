package com.zs.SmartTeam.mapper;

import com.zs.SmartTeam.model.TaskManagementModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskManagementModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_management
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    int deleteByPrimaryKey(Long taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_management
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    int insert(TaskManagementModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_management
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    TaskManagementModel selectByPrimaryKey(Long taskId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_management
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    List<com.zs.SmartTeam.model.TaskManagementModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table task_management
     *
     * @mbggenerated Sat May 04 21:16:19 CST 2019
     */
    int updateByPrimaryKey(TaskManagementModel record);
}
