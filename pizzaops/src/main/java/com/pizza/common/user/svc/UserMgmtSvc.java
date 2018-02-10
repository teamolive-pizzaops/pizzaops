package com.pizza.common.user.svc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pizza.common.user.mapper.UserListMapper;
import com.pizza.common.user.vo.UserVO;

@Service
public class UserMgmtSvc {
	
	@Autowired
    UserListMapper userListMapper;


	public String getNow() throws Exception {
		return userListMapper.getNow();
	}

	public UserVO selectOneUser(int userId) throws Exception {
		return userListMapper.selectOneUser(userId);
	}
	
	public List<UserVO> selectUserList(UserVO inVO) throws Exception {
		return userListMapper.selectUserList(inVO);
	}

	public int selectUserListCount(UserVO inVO) throws Exception {
		// TODO Auto-generated method stub
		return  userListMapper.selectUserListCount(inVO).getTotal();
	}


}
