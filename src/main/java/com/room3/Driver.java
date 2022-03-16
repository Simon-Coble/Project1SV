package com.room3;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.room3.dao.DaoImpl;

import com.room3.models.Crime;
import com.room3.models.SuperPrison;
import com.room3.models.SuperVillain;
import com.room3.util.Configuration;

public class Driver {

	static DaoImpl cdao = new DaoImpl();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException,
			InvocationTargetException, InstantiationException, NoSuchFieldException, SecurityException, SQLException {
		
		Configuration setStuff = new Configuration("C:\\Users\\mkolb\\Desktop\\New folder\\Project1SV\\src\\main\\resources\\application.properties");
		scan.nextLine();
		
		System.out.println("Running project demo Demo");
		//Creates all Tables from a package
		cdao.findAllClasses("com.room3.models");
		
		scan.nextLine();		

		Crime c1 = new Crime("Freezy", "covering the city in ice");
		Crime c2 = new Crime("Time Manipulation", "freezin' time, robbin'banks");
		Crime c3 = new Crime("Arson", "setting the city ablaze");
		Crime c4 = new Crime("Arson", "Fire and Fury");
		SuperPrison arkham = new SuperPrison("Arkham Asylum", "Gotham City");
		SuperVillain joker = new SuperVillain("The Joker", "evilness", 600000);
		
		cdao.insert(c4);
		cdao.insert(c1);
		cdao.insert(c2);
		cdao.insert(c3);
		cdao.insert(joker);
		cdao.insert(arkham);
		
		scan.nextLine();
		
		Crime updateCrime = (Crime) cdao.selectById(c3, 3);
		System.out.println(updateCrime);
		
		scan.nextLine();
		
		
		List<Object> crimes = cdao.selectAllByValueInColumn("Arson", "crime_name", Crime.class);
		System.out.println(crimes.toString());
		
		scan.nextLine();
	    cdao.deleteById(c1, 2);
		
		updateCrime.setCrimeName("robbery");
		updateCrime.setDescription("take stuff");
		System.out.println(cdao.updateSingle(updateCrime).toString());
		
		scan.nextLine();
		
		System.out.println(cdao.findAll(c1));
		
		cdao.deleteById(c1, 1);
	}

}
