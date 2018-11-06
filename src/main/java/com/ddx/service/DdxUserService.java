package com.ddx.service;

import java.util.List;

import com.ddx.pojo.DdxUser;

/**
 * 用户 service
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:03:06
 */
public interface DdxUserService {
 
	/**
	 * 获取所有用户信息
	 * @return
	 */
	List<DdxUser> getUserAll();
}