package com.pizza.common.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.pizza.common.user.vo.UserVO;

public class PizzaSessionUtil {
	
	public static UserVO getLoginUser(HttpServletRequest request){
		HttpSession session = request.getSession();
		return (UserVO) session.getAttribute("loginUser");
	}

}
