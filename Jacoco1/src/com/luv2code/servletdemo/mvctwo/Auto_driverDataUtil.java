package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class Auto_driverDataUtil {

	public static List<Auto_driver> getAuto_drivers() {
		
		// create an empty list
		List<Auto_driver> auto_drivers = new ArrayList<>();
		
		// add sample data
		auto_drivers.add(new Auto_driver("Santosh Khan","Maharashtra" , "MH04HJ6788"));
		auto_drivers.add(new Auto_driver("Mahil", "Maharashtra", "MH05YK8999"));
		auto_drivers.add(new Auto_driver("Komal", "Maharashtra", "MH06GH6667"));
		
		// return the list
		return auto_drivers;
	}
}






