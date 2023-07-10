package com.luv2code.servletdemo.mvctwo;

public class Ticket {

	private String name;
	private String place;
	private String ticket_type;
	
	public Ticket(String name, String place, String ticket_type) {
		super();
		this.name = name;
		this.place = place;
		this.ticket_type = ticket_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getplace() {
		return place; 
	}

	public void setplace(String place) {
		this.place=place;
	}

	public String getticket_type() {
		return ticket_type;
	}

	public void setticket_type(String ticket_type) {
		this.ticket_type= ticket_type;
	}

	
}
