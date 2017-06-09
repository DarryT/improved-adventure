package com.progresssoft.dao;
/**
 * @author Darry
 */
import com.progresssoft.bean.FileBean;

public interface ExtractFileDao {
	
	public void persist(FileBean dealData);
	public boolean extractData(Integer dealId,String fromCurrCode,String toCurrCode,String dealTimestamp,String dealAmt);

}
