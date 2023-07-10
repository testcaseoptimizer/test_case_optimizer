package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class MovieDataUtil {

	public static List<Movie> getMovie() {
		
		// create an empty list
		List<Movie> Movies = new ArrayList<>();
		
		// add sample data
		Movies.add(new Movie("TOPGUN",718, 8));
		Movies.add(new Movie("Race3", 100000, 1));
		Movies.add(new Movie("3 Idiots", 50000000, 8));
		
		// return the list
		return Movies;
	}
}