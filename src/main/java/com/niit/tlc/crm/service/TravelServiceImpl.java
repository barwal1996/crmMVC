package com.niit.tlc.crm.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.tlc.crm.Model.Travel;
import com.niit.tlc.crm.dao.TravelDAO;


@Service
public class TravelServiceImpl implements TravelService {
	@Autowired
	private TravelDAO travelDAO;

	
	@Transactional
	public void saveTravel(Travel tUser) {

	travelDAO.saveTravel(tUser);
	}


	public void savetravel(Travel tUser) {
		

	}

}