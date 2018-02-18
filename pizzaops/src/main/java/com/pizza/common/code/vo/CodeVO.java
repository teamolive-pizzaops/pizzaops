package com.pizza.common.code.vo;

import com.pizza.common.main.vo.AbstractVO;

public class CodeVO extends AbstractVO {
	
	private String classCodeName;
	private String code;
	private String CodeName;
	private int sortOrder;
	private String deleteYn;
	
	public String getClassCodeName() {
		return classCodeName;
	}
	public void setClassCodeName(String classCodeName) {
		this.classCodeName = classCodeName;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCodeName() {
		return CodeName;
	}
	public void setCodeName(String codeName) {
		CodeName = codeName;
	}
	public String getDeleteYn() {
		return deleteYn;
	}
	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
	public int getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}
	
}
