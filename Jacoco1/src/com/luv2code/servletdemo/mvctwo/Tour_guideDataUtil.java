package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class Tour_guideDataUtil {

	public static List<Tour_guide> getTour_guides() {
		
		// create an empty list
		List<Tour_guide> tour_guides = new ArrayList<>();
		
		// add sample data
		tour_guides.add(new Tour_guide("Ramesh", "TG4700", "Mumbai"));
		tour_guides.add(new Tour_guide("Rahul", "TG4790", "Goa"));
		tour_guides.add(new Tour_guide("Shraddha", "TG4800", "Hyderabad"));
		
		// return the list
		return tour_guides;
	}
}






