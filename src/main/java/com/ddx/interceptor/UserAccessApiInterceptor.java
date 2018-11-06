package com.ddx.interceptor;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.ddx.annotation.AccessRequired;

/**
 * 拦截url 的access_token
 * @author Lem0nRabbit
 * @date 2018年11月5日-下午4:25:23
 */
public class UserAccessApiInterceptor extends HandlerInterceptorAdapter {
	
	@SuppressWarnings("unused")
	public boolean preHandle(HttpServletRequest request, 
			HttpServletResponse response, 
			Object handler) throws Exception {
		
		System.out.println("进入拦截器----");
		
		HandlerMethod handlerMethod = (HandlerMethod) handler;
		Method method = handlerMethod.getMethod();
		AccessRequired annotation = method.getAnnotation(AccessRequired.class);
		
		/*if (null != annotation) {
			System.out.println("你遇到了: @AccessRequired");
			String accessToken = request.getParameter("access_token");
			
			response.getWriter().write("没有通过拦截, accessToken的值为: " + accessToken);
			return false;
		}    */
		
		// 没有注解通过拦截
		return true;
	}
}
