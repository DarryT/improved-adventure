package com.progresssoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Darry
 *
 */

@Controller
public class UploadFileController {

	@RequestMapping("/FileSearch")
	public String helloWorld() {
		 
		String message = "<br><div style='text-align:center;'> <h3>Hello Folks!</div><br><br>";
		return message;
	}
	
}
