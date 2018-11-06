package com.ddx.dao;

import com.ddx.pojo.DdxUser;
import com.ddx.pojo.DdxUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 用户 mapper
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:25:00
 */
public interface DdxUserMapper {
    
	int countByExample(DdxUserExample example);

    int deleteByExample(DdxUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DdxUser record);

    int insertSelective(DdxUser record);

    List<DdxUser> selectByExample(DdxUserExample example);

    DdxUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DdxUser record, @Param("example") DdxUserExample example);

    int updateByExample(@Param("record") DdxUser record, @Param("example") DdxUserExample example);

    int updateByPrimaryKeySelective(DdxUser record);

    int updateByPrimaryKey(DdxUser record);
}