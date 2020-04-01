package com.niit.tlc.crm.dao;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpServletRequest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.niit.tlc.crm.Model.Address;
import com.niit.tlc.crm.Model.EliteUser;



@Repository
public class EliteDAOImpl implements EliteDAO {
	
	

	@Autowired
	 private SessionFactory sessionFactory;
	
	@Override
	public void saveECustomer(Address add) {
		Session currentSession=sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(add);
	}
	
	@Override
	public EliteUser checkUser(EliteUser theEUser)
	{
		EliteUser eusr=null;
		Session session=null;
		try {
			 session = sessionFactory.getCurrentSession();
			 CriteriaBuilder cb = session.getCriteriaBuilder();
				CriteriaQuery<EliteUser> cq = cb.createQuery(EliteUser.class);
				Root<EliteUser> root = cq.from(EliteUser.class);
				
				//cq.select(root.get("id"));
				cq.select(root).where(cb.and(
						cb.equal(root.get("phoneNo"), theEUser.getPhoneNo()),
						cb.equal(root.get("password"),theEUser.getPassword())
					));
			
				Query query = session.createQuery(cq);
				query.setMaxResults(1);
				eusr=(EliteUser) query.getSingleResult();

				
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					if (session != null) {
						//session.close();
					}
				}
				
				return eusr;
			}

	
	

}
