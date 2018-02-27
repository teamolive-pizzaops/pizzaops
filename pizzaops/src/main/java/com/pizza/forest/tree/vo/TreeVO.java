package com.pizza.forest.tree.vo;

import com.pizza.common.main.vo.AbstractVO;

public class TreeVO extends AbstractVO{
	
	private int treeId;
	private int userId;
	private String treeName;
	private String description;
	private String itemStatusCode;
	
	
	public int getTreeId() {
		return treeId;
	}
	public void setTreeId(int treeId) {
		this.treeId = treeId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getTreeName() {
		return treeName;
	}
	public void setTreeName(String treeName) {
		this.treeName = treeName;
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
	
}
