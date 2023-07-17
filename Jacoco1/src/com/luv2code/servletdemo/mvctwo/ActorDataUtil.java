package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class ActorDataUtil {

	public static List<Actor> getActor() {
		
		// create an empty null listed arraylist
		List<Actor> Actors = new ArrayList<>();
		
		// add sample data
		Actors.add(new Actor("Tom", "Cruise", 61));
		Actors.add(new Actor("Tobey", "Maguire", 48));
		Actors.add(new Actor("Aamir", "Khan", 58));
		
		// return the list
		return Actors;
	}
}








