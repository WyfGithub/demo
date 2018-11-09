package com.mybatis.demo.entity;

import com.mybatis.demo.test;
import com.mybatis.demo.testExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface testMapper {
    long countByExample(testExample example);

    int deleteByExample(testExample example);

    int insert(test record);

    int insertSelective(test record);

    List<test> selectByExample(testExample example);

    int updateByExampleSelective(@Param("record") test record, @Param("example") testExample example);

    int updateByExample(@Param("record") test record, @Param("example") testExample example);
}