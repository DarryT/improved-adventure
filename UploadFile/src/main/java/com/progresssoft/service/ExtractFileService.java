package com.progresssoft.service;

import java.util.List;

import com.progresssoft.bean.ExtractFileEntity;

public interface ExtractFileService {
	
	public void extractData(List<ExtractFileEntity> dealData);
	
	boolean checkDuplicateFile(String fileName);
	
}
