package com.pizza.common.main.vo;

public class AbstractVO {
	
	
	private int start;
	private int length;
	private String orderBy;
	private String orderId;
	
	private String firstCreateDatetime;
	private int firstCreateUserId;
	private String lastModDatetime;
	private int lastModUserId;
	
	private int total;
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getFirstCreateDatetime() {
		return firstCreateDatetime;
	}
	public void setFirstCreateDatetime(String firstCreateDatetime) {
		this.firstCreateDatetime = firstCreateDatetime;
	}
	public int getFirstCreateUserId() {
		return firstCreateUserId;
	}
	public void setFirstCreateUserId(int firstCreateUserId) {
		this.firstCreateUserId = firstCreateUserId;
	}
	public String getLastModDatetime() {
		return lastModDatetime;
	}
	public void setLastModDatetime(String lastModDatetime) {
		this.lastModDatetime = lastModDatetime;
	}
	public int getLastModUserId() {
		return lastModUserId;
	}
	public void setLastModUserId(int lastModUserId) {
		this.lastModUserId = lastModUserId;
	}
	
}
