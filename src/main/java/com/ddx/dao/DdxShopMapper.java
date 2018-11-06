package com.ddx.dao;

import com.ddx.pojo.DdxShop;
import com.ddx.pojo.DdxShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 店铺 mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:24:46
 */
public interface DdxShopMapper {
   
	int countByExample(DdxShopExample example);

    int deleteByExample(DdxShopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DdxShop record);

    int insertSelective(DdxShop record);

    List<DdxShop> selectByExample(DdxShopExample example);

    DdxShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DdxShop record, @Param("example") DdxShopExample example);

    int updateByExample(@Param("record") DdxShop record, @Param("example") DdxShopExample example);

    int updateByPrimaryKeySelective(DdxShop record);

    int updateByPrimaryKey(DdxShop record);
}