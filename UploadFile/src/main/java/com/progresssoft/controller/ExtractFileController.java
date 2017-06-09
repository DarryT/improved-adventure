package com.progresssoft.controller;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.progresssoft.bean.FileBean;
import com.progresssoft.service.ExtractFileService;

/**
 * 
 * @author Darry
 *
 */
@ComponentScan
@Controller
public class ExtractFileController {
	
	@Autowired
	private ExtractFileService extractservice;
	final static Logger logger = Logger.getLogger(ExtractFileController.class);

	/*@RequestMapping("/extract")
	public String helloWorld() {
		 System.out.println(" you are in helloWorld");
		String message = "<br><div style='text-align:center;'> <h3>Hello Folks!</div><br><br>";
		return message;
	}*/
	
	@RequestMapping(value="/extract", method=RequestMethod.GET)
	public String extractData(Model model) {	
		System.out.println(" ugsddiufhvafsidfrhvauilrsg ");
		logger.debug("You are in extractData() method");
		FileBean fileData = new FileBean();		
		model.addAttribute("fileData", fileData);
		return "extract";
	}
	
	@RequestMapping(value="/extract", method=RequestMethod.POST)
	public String extractData(@Valid @ModelAttribute("fileData") FileBean fileData, BindingResult result) {
		System.out.println(" in extract data post");
		if (result.hasErrors()) {
			return "extract";
		} else {
			 extractservice.extractData(fileData.getDealId(),fileData.getFrmCurrCode(),fileData.getToCurrCode(),fileData.getDealTime(),fileData.getDealAmt());
			
			/*if (result) {				
				return "success";
			} else {				
				return "failure";
			}*/
		}
		return null;
		
	}
	
	
	
	public ExtractFileService getExtractservice() {
		return extractservice;
	}

	public void setExtractservice(ExtractFileService extractservice) {
		this.extractservice = extractservice;
	}
	
}
