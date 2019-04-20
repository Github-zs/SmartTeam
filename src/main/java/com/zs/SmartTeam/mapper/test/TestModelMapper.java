package com.zs.SmartTeam.mapper.test;

import com.zs.SmartTeam.model.TestModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface TestModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Sun Apr 21 02:31:44 CST 2019
     */
    int insert(TestModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test
     *
     * @mbggenerated Sun Apr 21 02:31:44 CST 2019
     */
    List<TestModel> selectAll();
}