package com.zs.SmartTeam.mapper;

import com.zs.SmartTeam.model.UserRoleModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    int insert(UserRoleModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    UserRoleModel selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    List<com.zs.SmartTeam.model.UserRoleModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_role
     *
     * @mbggenerated Tue May 07 09:11:42 CST 2019
     */
    int updateByPrimaryKey(UserRoleModel record);
}
