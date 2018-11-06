package com.ddx.dao;

import com.ddx.pojo.DdxDict;
import com.ddx.pojo.DdxDictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 基本字典 mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:24:07
 */
public interface DdxDictMapper {
	
    int countByExample(DdxDictExample example);

    int deleteByExample(DdxDictExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DdxDict record);

    int insertSelective(DdxDict record);

    List<DdxDict> selectByExample(DdxDictExample example);

    DdxDict selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DdxDict record, @Param("example") DdxDictExample example);

    int updateByExample(@Param("record") DdxDict record, @Param("example") DdxDictExample example);

    int updateByPrimaryKeySelective(DdxDict record);

    int updateByPrimaryKey(DdxDict record);
}