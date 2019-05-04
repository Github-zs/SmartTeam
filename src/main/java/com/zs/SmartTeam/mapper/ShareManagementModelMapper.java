package com.zs.SmartTeam.mapper;

import com.zs.SmartTeam.model.ShareManagementModel;
import java.util.List;

public interface ShareManagementModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table share_management
     *
     * @mbggenerated Sat May 04 21:25:22 CST 2019
     */
    int deleteByPrimaryKey(Long shareId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table share_management
     *
     * @mbggenerated Sat May 04 21:25:22 CST 2019
     */
    int insert(ShareManagementModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table share_management
     *
     * @mbggenerated Sat May 04 21:25:22 CST 2019
     */
    ShareManagementModel selectByPrimaryKey(Long shareId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table share_management
     *
     * @mbggenerated Sat May 04 21:25:22 CST 2019
     */
    List<com.zs.SmartTeam.model.ShareManagementModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table share_management
     *
     * @mbggenerated Sat May 04 21:25:22 CST 2019
     */
    int updateByPrimaryKey(ShareManagementModel record);
}