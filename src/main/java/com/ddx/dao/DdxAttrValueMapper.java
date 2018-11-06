package com.ddx.dao;

import com.ddx.pojo.DdxAttrValue;
import com.ddx.pojo.DdxAttrValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 商品属性 mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:24:02
 */
public interface DdxAttrValueMapper {
	
    int countByExample(DdxAttrValueExample example);

    int deleteByExample(DdxAttrValueExample example);

    int insert(DdxAttrValue record);

    int insertSelective(DdxAttrValue record);

    List<DdxAttrValue> selectByExample(DdxAttrValueExample example);

    int updateByExampleSelective(@Param("record") DdxAttrValue record, @Param("example") DdxAttrValueExample example);

    int updateByExample(@Param("record") DdxAttrValue record, @Param("example") DdxAttrValueExample example);
}