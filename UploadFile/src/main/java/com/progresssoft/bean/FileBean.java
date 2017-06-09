package com.progresssoft.bean;
import java.math.BigDecimal;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

@Entity
@Table(name = "data_values")
public class FileBean {
	@Id
	private Integer Id;
	
	@Column(name = "deal_Id")
	private String dealId;
	
	@Column(name = "frm_Curr_Code")
	private String frmCurrCode;
	
	@Column(name = "to_Curr_Code")
	private String toCurrCode;
	
	@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deal_Time")
	private Date dealTime;
	
	@Column(name = "deal_Amt")
	private BigDecimal dealAmt;
	
	//@OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "source_file")
    //private MyFile sourceFile;
	
/*	public Deal(Integer Id,String dealId, Timestamp date, BigDecimal amount, SourceFile sourceFile) {
        this.id = id;
        this.dealId = dealId;
        
        this.amount = amount;
        this.sourceFile = sourceFile;
    }*/
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getDealId() {
		return dealId;
	}
	public void setDealId(String dealId) {
		this.dealId = dealId;
	}
	public void setDealTime(Date dealTime) {
		this.dealTime = dealTime;
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

	public BigDecimal getDealAmt() {
		return dealAmt;
	}

	public void setDealAmt(BigDecimal dealAmt) {
		this.dealAmt = dealAmt;
	}

	public Date getDealTime() {
		return dealTime;
	}
	
	
}
