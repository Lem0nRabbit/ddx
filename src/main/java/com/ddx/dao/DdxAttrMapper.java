package com.ddx.dao;

import com.ddx.pojo.DdxAttr;
import com.ddx.pojo.DdxAttrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 属性  mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:23:57
 */
public interface DdxAttrMapper {
   
	int countByExample(DdxAttrExample example);

    int deleteByExample(DdxAttrExample example);

    int insert(DdxAttr record);

    int insertSelective(DdxAttr record);

    List<DdxAttr> selectByExample(DdxAttrExample example);

    int updateByExampleSelective(@Param("record") DdxAttr record, @Param("example") DdxAttrExample example);

    int updateByExample(@Param("record") DdxAttr record, @Param("example") DdxAttrExample example);
}