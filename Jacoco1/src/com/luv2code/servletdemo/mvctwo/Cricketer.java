package com.luv2code.servletdemo.mvctwo;

public class Cricketer {

	private String name;
	private String country;
	private String role;
	
	public Cricketer(String name, String country, String role) {
		super();
		this.name = name;
		this.country = country;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getcountry() {
		return country; 
	}

	public void setcountry(String country) {
		this.country=country;
	}

	public String getrole() {
		return role;
	}

	public void setrole(String role) {
		this.role = role;
	}

	
}
