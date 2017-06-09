package com.progresssoft.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.progresssoft.bean.FileBean;
import com.progresssoft.dao.ExtractFileDao;

public class ExtractFileServiceImpl implements ExtractFileService{
	@Autowired
	private ExtractFileDao extractdao;
	private ArrayList<FileBean> listOfObjects_100000= new ArrayList<FileBean>();
	
	public ExtractFileDao getExtractdao() {
		return extractdao;
	}

	public void setExtractdao(ExtractFileDao extractdao) {
		this.extractdao = extractdao;
	}

	public ArrayList<FileBean> getListOfObjects_100000() {
		return listOfObjects_100000;
	}

	public void setListOfObjects_100000(ArrayList<FileBean> listOfObjects_100000) {
		this.listOfObjects_100000 = listOfObjects_100000;
	}


	public void iterate(){
        for(FileBean d : listOfObjects_100000){
        	extractdao.persist(d);
        }
	}

	public boolean extractData(Integer dealId, String fromCurrCode, String toCurrCode, String dealTimestamp, String dealAmt) {
		for(FileBean d : listOfObjects_100000){
        	extractdao.persist(d);
        }
		return false;
	}

	public void persist(FileBean dealData) {
		
		
	}

	public boolean extractData(String dealId, String fromCurrCode, String toCurrCode, Date dealTimestamp,
			BigDecimal dealAmt) {
		// TODO Auto-generated method stub
		return false;
	}
}