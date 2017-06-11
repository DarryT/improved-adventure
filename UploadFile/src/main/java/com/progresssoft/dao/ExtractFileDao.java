package com.progresssoft.dao;

import java.sql.SQLException;
import java.util.List;

import com.progresssoft.bean.ExtractFileEntity;

public interface ExtractFileDao {
	
	public void extractData(List<ExtractFileEntity> data) throws SQLException;
	
	boolean checkDuplicateFile(String fileName);


}
