package com.pizza.common.user.vo;

import com.pizza.common.main.vo.AbstractVO;

public class UserVO extends AbstractVO{
	
	private int userId;
	private String emailAddr;
	private String userName;
	private String password;
	private String userTypeCd;
	private String userStatCd;
	private int passwordErrCnt;
	private String userYn;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getEmailAddr() {
		return emailAddr;
	}
	public void setEmailAddr(String emailAddr) {
		this.emailAddr = emailAddr;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserTypeCd() {
		return userTypeCd;
	}
	public void setUserTypeCd(String userTypeCd) {
		this.userTypeCd = userTypeCd;
	}
	public String getUserStatCd() {
		return userStatCd;
	}
	public void setUserStatCd(String userStatCd) {
		this.userStatCd = userStatCd;
	}
	public int getPasswordErrCnt() {
		return passwordErrCnt;
	}
	public void setPasswordErrCnt(int passwordErrCnt) {
		this.passwordErrCnt = passwordErrCnt;
	}
	public String getUserYn() {
		return userYn;
	}
	public void setUserYn(String userYn) {
		this.userYn = userYn;
	}
	
}
