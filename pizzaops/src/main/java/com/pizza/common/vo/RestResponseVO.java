package com.pizza.common.vo;

public class RestResponseVO {
	private int code;
	private String reason;
	
	public RestResponseVO() {
		super();
	}

	public RestResponseVO(int code, String reason) {
		super();
		this.code = code;
		this.reason = reason;
	}
	
	public RestResponseVO(int code) {
		super();
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	@Override
	public String toString() {
		return "RestResponseVO [code=" + code + ", reason=" + reason + "]";
	}

}
