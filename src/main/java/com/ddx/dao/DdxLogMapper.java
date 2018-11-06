package com.ddx.dao;

import com.ddx.pojo.DdxLog;
import com.ddx.pojo.DdxLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 日志 mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:24:26
 */
public interface DdxLogMapper {
    
	int countByExample(DdxLogExample example);

    int deleteByExample(DdxLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DdxLog record);

    int insertSelective(DdxLog record);

    List<DdxLog> selectByExample(DdxLogExample example);

    DdxLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DdxLog record, @Param("example") DdxLogExample example);

    int updateByExample(@Param("record") DdxLog record, @Param("example") DdxLogExample example);

    int updateByPrimaryKeySelective(DdxLog record);

    int updateByPrimaryKey(DdxLog record);
}