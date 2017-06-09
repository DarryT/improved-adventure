package com.progresssoft.dao;
/**
 * @author Darry
 */
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.progresssoft.bean.FileBean;

@Repository
public class ExtractFileDaoImpl implements ExtractFileDao{
	
	@PersistenceContext
    private EntityManager entityManager;

    public void extractData(FileBean dealData){
        entityManager.persist(dealData);
    }

	

	public void persist(FileBean dealData) {
		// TODO Auto-generated method stub
		
	}



	public boolean extractData(Integer dealId, String fromCurrCode, String toCurrCode, String dealTimestamp,
			String dealAmt) {
		// TODO Auto-generated method stub
		return false;
	}

}
