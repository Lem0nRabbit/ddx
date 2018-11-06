package com.ddx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ddx.pojo.DdxUser;
import com.ddx.service.DdxUserService;

/**
 * 
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:23:45
 */
@Controller
@RequestMapping("/user")
public class DdxUserController {
	
	@Autowired
	private DdxUserService userService;
	
	@RequestMapping("/getUserAll")
	public String getUserAll() {
		List<DdxUser> userList = userService.getUserAll();
		for (DdxUser user : userList) {
			System.out.println(user.getName()+ " " + user.getPhone() + " " + user.getExpireTime());
		}
		return "/index";
	}
}
