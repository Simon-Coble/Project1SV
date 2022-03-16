package com.room3;

import java.util.ArrayList;
import java.util.List;

import com.room3.dao.DaoImpl;
import com.room3.models.Crime;
import com.room3.models.SuperPrison;
import com.room3.models.SuperVillain;


public class Driver {

	
	
	public static void main(String[] args) {
		
		System.out.println("Running Hibernate Demo");
		
		DaoImpl nj = new DaoImpl();
		nj.findAllClasses("com.room3.models");
		
	}

}
