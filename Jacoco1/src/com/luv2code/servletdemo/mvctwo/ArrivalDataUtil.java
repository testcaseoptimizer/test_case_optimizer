package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class ArrivalDataUtil {

	public static List<Arrival> getArrival() 
	{
		
		// create an empty list
		List<Arrival> Arrivals = new ArrayList<>();
		
		// add sample data
		Arrivals.add(new Arrival("Indigo", "Delhi","1500 hrs" ));
		Arrivals.add(new Arrival("Vistara", "Mumbai","1430 hrs" ));
		Arrivals.add(new Arrival("Emirates", "Dubai", "1300 hrs"));
		
		// return the list
		return Arrivals;
	}
}