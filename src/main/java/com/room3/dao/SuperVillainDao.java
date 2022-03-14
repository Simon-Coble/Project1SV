package com.room3.dao;

import java.util.List;

import com.room3.models.SuperVillain;



public class SuperVillainDao {

	public int insert(SuperVillain vill) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		int pk = (int) ses.save(vill);
		
		tx.commit();
		
		return pk;
		
	}
	
	public List<SuperVillain> selectAll(){
		
		Session ses = HibernateUtil.getSession();
		
		List<SuperVillain> villList = ses.createQuery("from SuperVillain", SuperVillain.class).list();
		
		return villList;
		
	}
	
	public SuperVillain selectByName(String name) {
		
		Session ses = HibernateUtil.getSession();
		
		//SuperVillain vill = (SuperVillain) ses.createNativeQuery("SELECT * FROM supervillains WHERE name = '" + name + "'", SuperVillain.class);
		
		//SuperVillain vill = (SuperVillain) ses.createCriteria(SuperVillain.class).add(Restrictions.like("name", name));
		
		SuperVillain vill = (SuperVillain) ses.createQuery("from SuperVillain where name = '" + name + " '", SuperVillain.class);
		
		return vill;
	}
	
	public void update(SuperVillain vill) {
		
		Session ses = HibernateUtil.getSession();
		
		Transaction tx = ses.beginTransaction();
		
		ses.update(vill);
		
		tx.commit();
	
	}
	
}
