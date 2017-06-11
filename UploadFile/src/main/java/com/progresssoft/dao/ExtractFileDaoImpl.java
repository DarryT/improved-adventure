package com.progresssoft.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Darry
 */
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.progresssoft.bean.ExtractFileEntity;
import com.progresssoft.controller.ExtractFileController;

@Repository
@Component
public class ExtractFileDaoImpl implements ExtractFileDao{
	
	@PersistenceContext
    private EntityManager entityManager;
	String url = "jdbc:mysql://localhost:3306/datastore";
	final static Logger logger = Logger.getLogger(ExtractFileController.class);
	int count=0;
	
	@Transactional
    public void extractData(List<ExtractFileEntity> dealData) throws SQLException{
    	try{
    		logger.info("Entering extractData DaoImpl");
    		Connection connection = DriverManager.getConnection(url, "root", "Darry@13");
    		
    		PreparedStatement statement = connection.prepareStatement(" insert into data_values (Id,deal_Amt,deal_Id,deal_Time,frm_Curr_Code,to_Curr_Code,file_Name) values(?,?,?,?,?,?,?) ");
    	
    		for (ExtractFileEntity deal: dealData) {
    		
    			statement.setLong(1, deal.getId());
    			statement.setString(2, deal.getDealAmt());
    			statement.setString(3, deal.getDealId());
    			statement.setString(4, deal.getDealTime());
    			statement.setString(5, deal.getFrmCurrCode());
    			statement.setString(6, deal.getToCurrCode());
    			statement.setString(7, deal.getSourceFile());
    			
    			statement.addBatch();
    			
    			logger.info("Exiting extractData DaoImpl");
    		}
    		
    		statement.executeBatch(); 		
    		System.out.println("Time Taken="+(System.currentTimeMillis()));
    		statement.close();
    		connection.close();
    		
    	}
    	catch(Exception ex){
    		logger.error("Error in extractData DaoImpl");
    		ex.printStackTrace();
    	}
    	
       
    }

	public boolean checkDuplicateFile(String fileName) {
		boolean result = false;
		try{
		logger.info("Entering checkDuplicateFile DaoImpl");
		Connection connection = DriverManager.getConnection(url, "root", "Darry@13");
		String query = 	"select count(*) from data_values where file_Name = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, fileName);
		ResultSet rset = ps.executeQuery();
		
		if (rset.next())
	        count = rset.getInt(1);
		
	    if (count == 0)
	        result =  false;
	    else
	        result = true;
		
	    ps.close();
		connection.close();
		logger.info("Exiting checkDuplicateFile DaoImpl");
		}
		catch(Exception e){
			logger.error("Error in checkDuplicateFile DaoImpl");
			e.printStackTrace();		
		}
		return result;
	}

	public List<ExtractFileEntity> searchResult(String fileName) {
		ArrayList<ExtractFileEntity> searchResult=new ArrayList<ExtractFileEntity>();
		try
	    {
		logger.info("Entering searchResult DaoImpl");
		Connection connection = DriverManager.getConnection(url, "root", "Darry@13");
		String query = 	"select deal_Id, deal_Amt,frm_Curr_Code,to_Curr_Code,deal_Time from data_values where file_Name = ? ";
		PreparedStatement ps = connection.prepareStatement(query);		
		ps.setString(1, fileName);
		
	    ResultSet rs=ps.executeQuery();
	    
	    while(rs.next())
	    {
	    	ExtractFileEntity result= new ExtractFileEntity();
	    	result.setDealId(rs.getString(1));
	    	result.setDealAmt(rs.getString(2));
	    	result.setFrmCurrCode(rs.getString(3));
	    	result.setToCurrCode(rs.getString(4));
	    	result.setDealTime(rs.getString(5));
	    	searchResult.add(result);
	       
	    }
	    ps.close();
	    connection.close();
	    logger.info("Exiting searchResult DaoImpl");
	    }
	    catch(Exception e)
	    {
	       logger.error("Error in searchResult DaoImpl");
	       e.printStackTrace();
	    }
		
		return searchResult;
	}


}
