package com.ddx.dao;

import com.ddx.pojo.DdxGoods;
import com.ddx.pojo.DdxGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 商品 mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:24:12
 */
public interface DdxGoodsMapper {
    
	int countByExample(DdxGoodsExample example);

    int deleteByExample(DdxGoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DdxGoods record);

    int insertSelective(DdxGoods record);

    List<DdxGoods> selectByExample(DdxGoodsExample example);

    DdxGoods selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DdxGoods record, @Param("example") DdxGoodsExample example);

    int updateByExample(@Param("record") DdxGoods record, @Param("example") DdxGoodsExample example);

    int updateByPrimaryKeySelective(DdxGoods record);

    int updateByPrimaryKey(DdxGoods record);
}