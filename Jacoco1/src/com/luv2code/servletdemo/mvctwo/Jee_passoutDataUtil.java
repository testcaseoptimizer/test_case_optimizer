package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class Jee_passoutDataUtil {

	public static List<Jee_passout> getjee_passouts() {
		
		// create an empty list
		List<Jee_passout> jee_passouts = new ArrayList<>();
		
		// add sample data
		jee_passouts.add(new Jee_passout("Siddhanth",2021 , 18593));
		jee_passouts.add(new Jee_passout("Shubham", 2023, 2018));
		jee_passouts.add(new Jee_passout("Aryan", 2025, 1050));
		
		// return the list
		return jee_passouts;
	}
}






