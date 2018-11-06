package com.ddx.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddx.dao.DdxUserMapper;
import com.ddx.pojo.DdxUser;
import com.ddx.service.DdxUserService;

/**
 * 用户 service
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:29:27
 */
@Service
public class DdxUserServiceImpl implements DdxUserService {

	@Autowired
	private DdxUserMapper userMapper;
	
	@Override
	public List<DdxUser> getUserAll() {
		return userMapper.selectByExample(null);
	}

	
}