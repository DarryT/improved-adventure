package com.progresssoft.bean;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "data_values")
public class ExtractFileEntity {
	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "row_id", nullable = false, unique = true)
	private Long Id;
	
	@Column(name = "deal_Id")
	private String dealId;
	
	@Column(name = "frm_Curr_Code")
	private String frmCurrCode;
	
	@Column(name = "to_Curr_Code")
	private String toCurrCode;
	
	//@Temporal(TemporalType.TIMESTAMP)
    @Column(name = "deal_Time")
	private String dealTime;
	
	@Column(name = "deal_Amt")
	private String dealAmt;
	
	//@OneToOne(cascade = CascadeType.ALL)
   // @JoinColumn(name = "source_file")
	@Column(name= "file_Name")
    private String sourceFile;
	
	
	
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
	public String getDealTime() {
		return dealTime;
	}
	public void setDealTime(String dealTime) {
		this.dealTime = dealTime;
	}
	public String getDealAmt() {
		return dealAmt;
	}
	public void setDealAmt(String dealAmt) {
		this.dealAmt = dealAmt;
	}
	public String getSourceFile() {
		return sourceFile;
	}
	public void setSourceFile(String sourceFile) {
		this.sourceFile = sourceFile;
	}

	
	
	
}
