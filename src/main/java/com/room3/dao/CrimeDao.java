package com.room3.dao;

import com.room3.models.Crime;

public class CrimeDao {

	public int insert(Crime crime) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		int pk =(int) ses.save(crime);
		
		tx.commit();
		
		return pk;
		
	}
}
