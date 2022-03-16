package com.room3;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.room3.dao.DaoImpl;


import com.room3.models.Crime;
import com.room3.models.SuperPrison;
import com.room3.models.SuperVillain;
import com.room3.util.Configuration;


public class Driver {


	static DaoImpl cdao = new DaoImpl();
//	static SuperPrisonDao spdao = new SuperPrisonDao();
//	static SuperVillainDao svdao = new SuperVillainDao();

	
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException, SecurityException, SQLException  {
		
		System.out.println("Running project demo Demo");
		
		Configuration setStuff = new Configuration("C:\\Users\\mkolb\\Desktop\\New folder\\Project1SV\\src\\main\\resources\\application.properties");
		
		
		Crime c1 = new Crime(1,"Freezy", "covering the city in ice");
//		Crime c2 = new Crime("Time Manipulation", "freezin' time, robbin'banks");
//		Crime c3 = new Crime("Arson", "setting the city ablaze");
//		cdao.findAllClasses("com.room3.models");
//		cdao.insert(c1);
//		cdao.insert(c2);
//		cdao.insert(c3);
//		
		
		
		SuperPrison arkham = new SuperPrison("Arkham Asylum", "Gotham City");
		
		SuperVillain joker = new SuperVillain(1,"The Joker", "evilness", 600000);
	
		//cdao.insert(arkham);
		//cdao.selectById(joker,1);
		List<Object> crimes = cdao.selectAllByValueInColumn("evilness", "superpower", SuperVillain.class);
		System.out.println(crimes.toString());
		//cdao.deleteById(c1, 2);

		
		System.out.println(cdao.updateSingle(joker).toString());
	}

}
