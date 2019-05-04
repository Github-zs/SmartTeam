package com.zs.SmartTeam.mapper;

import com.zs.SmartTeam.model.RequirementManagementModel;
import java.util.List;

public interface RequirementManagementModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement-management
     *
     * @mbggenerated Sat May 04 21:23:35 CST 2019
     */
    int deleteByPrimaryKey(Long requirementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement-management
     *
     * @mbggenerated Sat May 04 21:23:35 CST 2019
     */
    int insert(RequirementManagementModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement-management
     *
     * @mbggenerated Sat May 04 21:23:35 CST 2019
     */
    RequirementManagementModel selectByPrimaryKey(Long requirementId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement-management
     *
     * @mbggenerated Sat May 04 21:23:35 CST 2019
     */
    java.util.List<com.zs.SmartTeam.model.RequirementManagementModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table requirement-management
     *
     * @mbggenerated Sat May 04 21:23:35 CST 2019
     */
    int updateByPrimaryKey(RequirementManagementModel record);
}