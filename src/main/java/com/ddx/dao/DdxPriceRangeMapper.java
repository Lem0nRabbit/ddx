package com.ddx.dao;

import com.ddx.pojo.DdxPriceRange;
import com.ddx.pojo.DdxPriceRangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 阶梯价格 mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:24:33
 */
public interface DdxPriceRangeMapper {
 
	int countByExample(DdxPriceRangeExample example);

    int deleteByExample(DdxPriceRangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DdxPriceRange record);

    int insertSelective(DdxPriceRange record);

    List<DdxPriceRange> selectByExample(DdxPriceRangeExample example);

    DdxPriceRange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DdxPriceRange record, @Param("example") DdxPriceRangeExample example);

    int updateByExample(@Param("record") DdxPriceRange record, @Param("example") DdxPriceRangeExample example);

    int updateByPrimaryKeySelective(DdxPriceRange record);

    int updateByPrimaryKey(DdxPriceRange record);
}