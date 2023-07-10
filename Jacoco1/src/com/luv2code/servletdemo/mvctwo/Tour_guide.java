package com.luv2code.servletdemo.mvctwo;

public class Tour_guide {

	private String name;
	private String id;
	private String place;
	
	public Tour_guide(String name, String id, String place) {
		super();
		this.name = name;
		this.id = id;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getid() {
		return id; 
	}

	public void setid(String id) {
		this.id=id;
	}

	public String getplace() {
		return place;
	}

	public void setplace(String place) {
		this.place = place;
	}

	
}
