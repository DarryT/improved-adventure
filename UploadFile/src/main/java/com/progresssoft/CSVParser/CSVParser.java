package com.progresssoft.CSVParser;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.progresssoft.bean.ExtractFileEntity;

public class CSVParser {

	public void parseCSVFileAsList() throws IOException {
		//create CSVReader object
		CSVReader reader = new CSVReader(new FileReader("TestFile.csv"), ',');
		
		List<ExtractFileEntity> dealData = new ArrayList<ExtractFileEntity>();
		//read all lines at once
		List<String[]> records = reader.readAll();
		
		Iterator<String[]> iterator = records.iterator();
		//skip header row
		iterator.next();
		
		while(iterator.hasNext()){
			String[] record = iterator.next();
			ExtractFileEntity deal = new ExtractFileEntity();
			
			deal.setId(Long.parseLong(record[0]));
			deal.setFrmCurrCode(record[1]);
			deal.setToCurrCode(record[2]);
			deal.setDealTime(record[3]);
			deal.setDealAmt(record[4]);
			dealData.add(deal);
			
		}
		
		reader.close();
		
		System.out.println(dealData);
	}
	
	
/*private static void parseCSVToBeanList() throws IOException {
		
		HeaderColumnNameTranslateMappingStrategy<Employee> beanStrategy = new HeaderColumnNameTranslateMappingStrategy<Employee>();
		beanStrategy.setType(Employee.class);
		
		Map<String, String> columnMapping = new HashMap<String, String>();
		columnMapping.put("ID", "id");
		columnMapping.put("Name", "name");
		columnMapping.put("Role", "role");
		//columnMapping.put("Salary", "salary");
		
		beanStrategy.setColumnMapping(columnMapping);
		
		CsvToBean<Employee> csvToBean = new CsvToBean<Employee>();
		CSVReader reader = new CSVReader(new FileReader("employees.csv"));
		List<Employee> emps = csvToBean.parse(beanStrategy, reader);
		System.out.println(emps);
	}*/
}
