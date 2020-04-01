package com.niit.tlc.crm.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.tlc.crm.Model.Travel;

@Repository
public class TravelDAOImpl implements TravelDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void saveTravel(Travel tUser) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(tUser);
	}

}
