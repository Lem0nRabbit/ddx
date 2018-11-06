package com.ddx.dao;

import com.ddx.pojo.DdxSku;
import com.ddx.pojo.DdxSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 商品SKU mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:24:51
 */
public interface DdxSkuMapper {
   
	int countByExample(DdxSkuExample example);

    int deleteByExample(DdxSkuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DdxSku record);

    int insertSelective(DdxSku record);

    List<DdxSku> selectByExample(DdxSkuExample example);

    DdxSku selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DdxSku record, @Param("example") DdxSkuExample example);

    int updateByExample(@Param("record") DdxSku record, @Param("example") DdxSkuExample example);

    int updateByPrimaryKeySelective(DdxSku record);

    int updateByPrimaryKey(DdxSku record);
}