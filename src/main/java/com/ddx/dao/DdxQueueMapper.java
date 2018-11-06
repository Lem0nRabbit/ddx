package com.ddx.dao;

import com.ddx.pojo.DdxQueue;
import com.ddx.pojo.DdxQueueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 阶梯价格 mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:24:40
 */
public interface DdxQueueMapper {
    
	int countByExample(DdxQueueExample example);

    int deleteByExample(DdxQueueExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DdxQueue record);

    int insertSelective(DdxQueue record);

    List<DdxQueue> selectByExample(DdxQueueExample example);

    DdxQueue selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DdxQueue record, @Param("example") DdxQueueExample example);

    int updateByExample(@Param("record") DdxQueue record, @Param("example") DdxQueueExample example);

    int updateByPrimaryKeySelective(DdxQueue record);

    int updateByPrimaryKey(DdxQueue record);
}