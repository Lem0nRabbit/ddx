package com.ddx.dao;

import com.ddx.pojo.DdxLargeObject;
import com.ddx.pojo.DdxLargeObjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 大对象 mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:24:18
 */
public interface DdxLargeObjectMapper {
  
	int countByExample(DdxLargeObjectExample example);

    int deleteByExample(DdxLargeObjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DdxLargeObject record);

    int insertSelective(DdxLargeObject record);

    List<DdxLargeObject> selectByExample(DdxLargeObjectExample example);

    DdxLargeObject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DdxLargeObject record, @Param("example") DdxLargeObjectExample example);

    int updateByExample(@Param("record") DdxLargeObject record, @Param("example") DdxLargeObjectExample example);

    int updateByPrimaryKeySelective(DdxLargeObject record);

    int updateByPrimaryKey(DdxLargeObject record);
}