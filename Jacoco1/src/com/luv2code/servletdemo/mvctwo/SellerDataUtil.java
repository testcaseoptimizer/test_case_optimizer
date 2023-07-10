package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class SellerDataUtil {

	public static List<Seller> getSellers() {
		
		// create an empty list
		List<Seller> sellers = new ArrayList<>();
		
		// add sample data
		sellers.add(new Seller("Wellness_Forever",20 , "Medicines"));
		sellers.add(new Seller("Santosh_stores", 10, "Vegetables"));
		sellers.add(new Seller("Baskin and Robbins", 20, "Ice cream"));
		
		// return the list
		return sellers;
	}
}






