package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class CricketerDataUtil {

	public static List<Cricketer> getcricketers() {
		
		// create an empty list
		List<Cricketer> cricketers = new ArrayList<>();
		
		// add sample data
		cricketers.add(new Cricketer("MS Dhoni","India" , "Wicket keeper-Batsman"));
		cricketers.add(new Cricketer("Ben Stokes", "England", "All rounder"));
		cricketers.add(new Cricketer("David Warner", "Australia", "Batsman"));
		
		// return the list
		return cricketers;
	}
}






