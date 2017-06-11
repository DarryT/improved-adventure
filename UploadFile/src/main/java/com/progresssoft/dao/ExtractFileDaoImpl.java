package com.progresssoft.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Darry
 */
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.progresssoft.bean.ExtractFileEntity;

@Repository
@Component
public class ExtractFileDaoImpl implements ExtractFileDao{
	
	@PersistenceContext
    private EntityManager entityManager;
	String url = "jdbc:mysql://localhost:3306/datastore";
	int count=0;
	
	@Transactional
    public void extractData(List<ExtractFileEntity> dealData) throws SQLException{
    	try{
    		
    		Connection connection = DriverManager.getConnection(url, "root", "Darry@13");
    		
    		PreparedStatement statement = connection.prepareStatement(" insert into data_values (Id,deal_Amt,deal_Id,deal_Time,frm_Curr_Code,to_Curr_Code,file_Name) values(?,?,?,?,?,?,?) ");
    	
    		for (ExtractFileEntity deal: dealData) {
    			//String query = "insert into data_values (Id,deal_Amt,deal_Id,deal_Time,frm_Curr_Code,to_Curr_Code) values('"+ deal.getId() + "','" + deal.getDealAmt() + "','" + deal.getDealId() + "','" + deal.getDealTime() + "','" + deal.getFrmCurrCode() + "','" + deal.getToCurrCode() + "')";
    			statement.setLong(1, deal.getId());
    			statement.setString(2, deal.getDealAmt());
    			statement.setString(3, deal.getDealId());
    			statement.setString(4, deal.getDealTime());
    			statement.setString(5, deal.getFrmCurrCode());
    			statement.setString(6, deal.getToCurrCode());
    			statement.setString(7, deal.getSourceFile());
    			
    			statement.addBatch();
    			
    			/*count++;
                if ( (count % 50) == 0) {
                	entityManager.flush();
                	entityManager.clear();
                }  */
    		}
    		
    		statement.executeBatch();
    		System.out.println("Time Taken="+(System.currentTimeMillis()));
    		statement.close();
    		connection.close();
    		
    	}
    	catch(Exception ex){
    		ex.printStackTrace();
    	}
    	
       
    }

	public boolean checkDuplicateFile(String fileName) {
		boolean result = false;
		try{
		Connection connection = DriverManager.getConnection(url, "root", "Darry@13");
		String query = 	"select count(*) from data_values where file_Name = ? ";
		PreparedStatement ps = connection.prepareStatement(query);
		ps.setString(1, fileName);
		ps.executeQuery();
		
		
		
		
		
		}
		catch(Exception e){
			
		}
		return result;
	}


}
