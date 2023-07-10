package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class FootballDataUtil {

	public static List<Football> getFootball() {
		
		// create an empty list
		List<Football> Footballer = new ArrayList<>();
		
		// add sample data
		Footballer.add(new Football("Ronaldo", "Madrid", "Portuguese"));
		Footballer.add(new Football("Messi", "Barcelona", "Argentine"));
		Footballer.add(new Football("Neymar", "PSG", "Brazilian"));
		
		// return the list
		return Footballer;
	}
}





