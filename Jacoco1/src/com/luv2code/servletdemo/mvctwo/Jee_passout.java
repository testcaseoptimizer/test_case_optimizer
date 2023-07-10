package com.luv2code.servletdemo.mvctwo;

public class Jee_passout {

	private String name;
	private int year ;
	private int rank ;
	
	public Jee_passout(String name, int year, int rank) {
		super();
		this.name = name;
		this.year = year;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public int getyear() {
		return year; 
	}

	public void setyear(int year) {
		this.year=year;
	}

	public int getrank() {
		return rank;
	}

	public void setrank(int rank) {
		this.rank = rank;
	}

	
}
