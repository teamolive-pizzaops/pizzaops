package com.pizza.common.code.vo;

import com.pizza.common.main.vo.AbstractVO;

public class CodeVO extends AbstractVO{
	
	private String classCodeName;
	private String description;
	private String deleteYn;
	
//	private String firstCreateDatetime;
//	private int firstCreateUserId;
//	private String lastModDatetime;
//	private int lastModUserId;
	
	public String getClassCodeName() {
		return classCodeName;
	}
	public void setClassCodeName(String classCodeName) {
		this.classCodeName = classCodeName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDeleteYn() {
		return deleteYn;
	}
	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
	
}
