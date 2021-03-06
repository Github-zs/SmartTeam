package com.zs.SmartTeam.mapper;

import com.zs.SmartTeam.model.DesignManagementModel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DesignManagementModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_management
     *
     * @mbggenerated Fri May 10 04:56:49 CST 2019
     */
    int deleteByPrimaryKey(Long designId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_management
     *
     * @mbggenerated Fri May 10 04:56:49 CST 2019
     */
    int insert(DesignManagementModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_management
     *
     * @mbggenerated Fri May 10 04:56:49 CST 2019
     */
    DesignManagementModel selectByPrimaryKey(Long designId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_management
     *
     * @mbggenerated Fri May 10 04:56:49 CST 2019
     */
    List<DesignManagementModel> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table design_management
     *
     * @mbggenerated Fri May 10 04:56:49 CST 2019
     */
    int updateByPrimaryKey(DesignManagementModel record);

    /**
     * select design list by author id
     *
     * @param designAuthor
     * @return
     */
    List<DesignManagementModel> selectByAuthor(Long designAuthor);
}
