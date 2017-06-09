package com.progresssoft.service;

import java.math.BigDecimal;
import java.util.Date;

import com.progresssoft.bean.FileBean;

public interface ExtractFileService {
	
	public void persist(FileBean dealData);
	public boolean extractData(String dealId,String fromCurrCode,String toCurrCode,Date dealTimestamp,BigDecimal dealAmt);
	
}
