package com.room3;

import java.util.ArrayList;
import java.util.List;

import com.room3.dao.CrimeDao;
import com.room3.dao.SuperPrisonDao;
import com.room3.dao.SuperVillainDao;
import com.room3.models.Crime;
import com.room3.models.SuperPrison;
import com.room3.models.SuperVillain;


public class Driver {

	static CrimeDao cdao = new CrimeDao();
	static SuperPrisonDao spdao = new SuperPrisonDao();
	static SuperVillainDao svdao = new SuperVillainDao();
	
	public static void main(String[] args) {
		
		System.out.println("Running Hibernate Demo");
		
		Crime c1 = new Crime("Freezy power", "covering the city in ice");
		Crime c2 = new Crime("Time Manipulation", "freezin' time, robbin'banks");
		Crime c3 = new Crime("Arson", "setting the city ablaze");
		
		cdao.insert(c1);
		cdao.insert(c2);
		cdao.insert(c3);
		
		List<Crime> crimes = new ArrayList<Crime>();
		
		crimes.add(c1);
		crimes.add(c2);
		crimes.add(c3);
		
		SuperPrison arkham = new SuperPrison("Arkham Asylum", "Gotham City");
		
		SuperVillain joker = new SuperVillain("The Joker", "evilness", 1_000_000.05, crimes, arkham);
	
		spdao.insert(arkham);
		svdao.insert(joker);
		
	}

}
