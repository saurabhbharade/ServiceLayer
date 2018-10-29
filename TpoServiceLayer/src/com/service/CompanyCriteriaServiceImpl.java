package com.service;

import java.util.List;

import com.dao.CompanyCriteriaDao;
import com.dao.CompanyCriteriaDaoImpl;
import com.model.CompanyCriteria;

public class CompanyCriteriaServiceImpl implements CompanyCriteriaService{
CompanyCriteriaDao companyCriteriaDao=new CompanyCriteriaDaoImpl();
	@Override
	public List<CompanyCriteria> getCompanyCriteria(int cid) {
		return companyCriteriaDao.getCompanyCriteria(cid);
	}
	
	

}
