package com.pizza.common.user.svc;

import java.util.List;

import com.pizza.common.user.vo.UserVO;

public interface UserMgmtSvc {
	
	String getNow() throws Exception;
	
	UserVO selectOneUser() throws Exception;

	List<UserVO> selectUserList(UserVO inVO) throws Exception;
	
	int selectUserListCount(UserVO inVO) throws Exception;

}
