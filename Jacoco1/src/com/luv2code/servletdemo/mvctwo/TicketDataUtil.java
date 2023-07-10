package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class TicketDataUtil {

	public static List<Ticket> getTickets() {
		
		// create an empty list
		List<Ticket> tickets = new ArrayList<>();
		
		// add sample data
		tickets.add(new Ticket("Rajani", "Mumbai", "bus ticket"));
		tickets.add(new Ticket("Rohit", "Pune", "Train ticket"));
		tickets.add(new Ticket("Sourav", "Goa", "Flight ticket"));
		
		// return the list
		return tickets;
	}
}






