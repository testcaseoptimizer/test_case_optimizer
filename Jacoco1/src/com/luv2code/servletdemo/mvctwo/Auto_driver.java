package com.luv2code.servletdemo.mvctwo;

public class Auto_driver {

	private String name;
	private String place;
	private String auto_no;
	
	public Auto_driver(String name, String place, String auto_no) {
		super();
		this.name = name;
		this.place = place;
		this.auto_no = auto_no;
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

	public String getauto_no() {
		return auto_no;
	}

	public void setauto_no(String auto_no) {
		this.auto_no = auto_no;
	}

	
}
