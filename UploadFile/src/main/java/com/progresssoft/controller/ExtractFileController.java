package com.progresssoft.controller;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.opencsv.CSVReader;
import com.progresssoft.bean.ExtractFileEntity;
import com.progresssoft.service.ExtractFileService;

/**
 * 
 * @author Darry
 *
 */

@Controller
@Component
public class ExtractFileController {
	
	@Autowired(required=false)
	private ExtractFileService extractservice;
	final static Logger logger = Logger.getLogger(ExtractFileController.class);
	ExtractFileEntity data = new ExtractFileEntity();
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int RowID=0;
	List<ExtractFileEntity> dealData = new ArrayList<ExtractFileEntity>();
	    
	    @RequestMapping(value = "/Success")
	    public String extractData(@RequestParam(value = "file")final CommonsMultipartFile multiFile) throws Exception {  
	    	try{
	 	        logger.info("Inside extractData");
	 	        File file = new File(getClass().getResource("/WEB-INF/TestFile.csv").toURI());   	            
	 	        CSVReader reader = new CSVReader(new FileReader(file), ',');       
	 	        boolean fileChk = checkDuplicateFile("TestFile.csv");	
	 	       
	 	        //To check if file has already been extracted
	 	        if(fileChk==false){
	 	    	  List<String[]> records = reader.readAll();
		 	  		
		 	  		Iterator<String[]> iterator = records.iterator();
		 	  		
		 	  		while(iterator.hasNext()){
		 	  			String[] record = iterator.next();
		 	  			ExtractFileEntity deal = new ExtractFileEntity();
		 	  			
		 	  			RowID = count.incrementAndGet();
		 	  			
		 	  			deal.setId(Long.valueOf(RowID));
		 	  			deal.setDealId(record[0]);
		 	  			deal.setFrmCurrCode(record[1]);
		 	  			deal.setToCurrCode(record[2]);
		 	  			deal.setDealTime(record[3]);
		 	  			deal.setDealAmt(record[4]);
		 	  			deal.setSourceFile("TestFile.csv");
		 	  			dealData.add(deal);
		 	  			
		 	  			logger.info("Exiting extractData()");
		 	  		} 	  		
		 	  		reader.close();	  	
		 	        extractservice.extractData(dealData);
	 	       }
	 	       else{
	 	    	   		
	 	       }  
	    	}
	    	catch(Exception ex){
	    		ex.printStackTrace();
	    		logger.error("Error Occurred in extractData()");
	    	}
	    	return "Success"; 	    	
	    }  
	    
	    
	    private boolean checkDuplicateFile(String fileName) {
	    	boolean result = false;
	    	try{
	    		extractservice.checkDuplicateFile(fileName);
	    	}
	    	catch(Exception e){
	    		
	    	}
	    	return result;
	    	}
	    	 
	
	
	
	/*@RequestMapping(value="/Success")
	public String extractData() {
		String result = "fail";
		try{		
			System.out.println(" in extract data post method");
			//extractservice.extractData(fileData);
			result= "success";		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}*/
	
	
	public ExtractFileService getExtractservice() {
		return extractservice;
	}

	public void setExtractservice(ExtractFileService extractservice) {
		this.extractservice = extractservice;
	}
	
}
