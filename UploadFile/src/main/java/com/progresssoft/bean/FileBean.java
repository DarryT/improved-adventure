package com.progresssoft.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FileBean {
	private String dealId;
	private String frmCurrCode;
	private String toCurrCode;
	private String dealTime;
	private String dealAmt;
	
	@Id
	@GeneratedValue
	public String getDealId() {
		return dealId;
	}
	public void setDealId(String dealId) {
		this.dealId = dealId;
	}
	
	@Column
	public String getFrmCurrCode() {
		return frmCurrCode;
	}
	public void setFrmCurrCode(String frmCurrCode) {
		this.frmCurrCode = frmCurrCode;
	}
	
	@Column
	public String getToCurrCode() {
		return toCurrCode;
	}
	public void setToCurrCode(String toCurrCode) {
		this.toCurrCode = toCurrCode;
	}
	
	@Column
	public String getDealTime() {
		return dealTime;
	}
	public void setDealTime(String dealTime) {
		this.dealTime = dealTime;
	}
	
	@Column
	public String getDealAmt() {
		return dealAmt;
	}
	public void setDealAmt(String dealAmt) {
		this.dealAmt = dealAmt;
	}
	
	
}
