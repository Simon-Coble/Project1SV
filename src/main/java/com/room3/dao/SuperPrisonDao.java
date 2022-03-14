package com.room3.dao;

import com.room3.models.SuperPrison;

public class SuperPrisonDao {

	public int insert(SuperPrison sp) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		int pk = (int) ses.save(tx);
		
		tx.commit();
		
		return pk;
	}
	
	public SuperPrison selectById(int id) {
		
		Session ses = HibernateUtil.getSession();
		
		SuperPrison sp = ses.get(SuperPrison.class, id);
		
		return sp;
	}
	
	
}
