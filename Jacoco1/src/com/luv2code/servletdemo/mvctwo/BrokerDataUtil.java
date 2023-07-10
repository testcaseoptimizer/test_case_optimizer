package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class BrokerDataUtil {

	public static List<Broker> getBroker() {
		
		// create an empty list
		List<Broker> buyers = new ArrayList<>();
		
		// add sample data
		buyers.add(new Broker("Ram", "Kumar", 61,10));
		buyers.add(new Broker("Rishi", "Singh", 48,5));
		buyers.add(new Broker("Rishi", "Kapoor", 58,4));
		
		// return the list
		return buyers;
	}
}





