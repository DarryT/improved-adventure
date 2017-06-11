package com.progresssoft.bean;

import java.math.BigDecimal;
import java.util.Date;

public class ExtractFileBean {
	
	private Long Id;
	private String dealId;
	private String frmCurrCode;
	private String toCurrCode;
	private Date dealTime;
	private BigDecimal dealAmt;
	
	
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getDealId() {
		return dealId;
	}
	public void setDealId(String dealId) {
		this.dealId = dealId;
	}
	public String getFrmCurrCode() {
		return frmCurrCode;
	}
	public void setFrmCurrCode(String frmCurrCode) {
		this.frmCurrCode = frmCurrCode;
	}
	public String getToCurrCode() {
		return toCurrCode;
	}
	public void setToCurrCode(String toCurrCode) {
		this.toCurrCode = toCurrCode;
	}
	public Date getDealTime() {
		return dealTime;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
	}
	public BigDecimal getDealAmt() {
		return dealAmt;
	}
	public void setDealAmt(BigDecimal dealAmt) {
		this.dealAmt = dealAmt;
	}
	
	
	
	
}
