package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class ScientistDataUtil {

	public static List<Scientist> getScientist() {
		
		// create an empty list
		List<Scientist> Scientists = new ArrayList<>();
		
		// add sample data
		Scientists.add(new Scientist("Einstein", "Theory of Relativity", 1905));
		Scientists.add(new Scientist("Newton", "Laws Of Motion", 1666));
		Scientists.add(new Scientist("J.J Thompson", "Electrons",1897 ));
		
		// return the list
		return Scientists;
	}
}

