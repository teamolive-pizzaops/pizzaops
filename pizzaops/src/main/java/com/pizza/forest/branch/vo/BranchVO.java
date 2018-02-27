package com.pizza.forest.branch.vo;

import com.pizza.common.main.vo.AbstractVO;

public class BranchVO extends AbstractVO{
	
	private int branchId;
	private int treeId;
	private String branchName;
	private String description;
	private String itemStatusCode;
	private String goalDate;
	private int userId;
	
	
	public int getBranchId() {
		return branchId;
	}
	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}
	public int getTreeId() {
		return treeId;
	}
	public void setTreeId(int treeId) {
		this.treeId = treeId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getItemStatusCode() {
		return itemStatusCode;
	}
	public void setItemStatusCode(String itemStatusCode) {
		this.itemStatusCode = itemStatusCode;
	}
	public String getGoalDate() {
		return goalDate;
	}
	public void setGoalDate(String goalDate) {
		this.goalDate = goalDate;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
