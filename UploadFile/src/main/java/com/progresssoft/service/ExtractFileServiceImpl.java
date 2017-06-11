package com.progresssoft.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.progresssoft.bean.ExtractFileEntity;
import com.progresssoft.controller.ExtractFileController;
import com.progresssoft.dao.ExtractFileDao;

@Service()
public class ExtractFileServiceImpl implements ExtractFileService{
	
	
	@Autowired
	private ExtractFileDao extractdao;
	final static Logger logger = Logger.getLogger(ExtractFileController.class);
	
	public ExtractFileDao getExtractdao() {
		return extractdao;
	}

	public void setExtractdao(ExtractFileDao extractdao) {
		this.extractdao = extractdao;
	}


	 @Transactional(readOnly = false)
	public void extractData(List<ExtractFileEntity> dealData) {
		
		 try {	          
			 extractdao.extractData(dealData);
			 	 
       } catch (Exception e) {
    	   	e.printStackTrace();
    	   	logger.error("Problem in prepareDataForUpdate while comparing persistent data with the csv file data", e);
       }
		
	}

	public boolean checkDuplicateFile(String fileName) {
		
		return extractdao.checkDuplicateFile(fileName);
	}
	
	
	
}