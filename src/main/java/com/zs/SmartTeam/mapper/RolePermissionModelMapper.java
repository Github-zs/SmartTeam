package com.zs.SmartTeam.mapper;

import com.zs.SmartTeam.model.RolePermissionModel;
import java.util.List;

public interface RolePermissionModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun Dec 22 09:33:05 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun Dec 22 09:33:05 CST 2019
     */
    int insert(RolePermissionModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun Dec 22 09:33:05 CST 2019
     */
    RolePermissionModel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun Dec 22 09:33:05 CST 2019
     */
    java.util.List<com.zs.SmartTeam.model.RolePermissionModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role_permission
     *
     * @mbggenerated Sun Dec 22 09:33:05 CST 2019
     */
    int updateByPrimaryKey(RolePermissionModel record);
}