package com.pizza.common.user.mapper;

import com.pizza.common.user.vo.LoginVO;
import com.pizza.common.user.vo.UserVO;

public interface LoginMapper {

	public UserVO selectOneUserForLogin(LoginVO inVO) throws Exception;
	
	public int insertLoginHistory(LoginVO inVO) throws Exception;
	
}
