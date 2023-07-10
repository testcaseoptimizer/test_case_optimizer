package com.luv2code.servletdemo.mvctwo;

public class Seller {

	private String name;
	private int no_of_branches;
	private String product;
	
	public Seller(String name, int no_of_branches, String product) {
		super();
		this.name = name;
		this.no_of_branches = no_of_branches;
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public int getno_of_branches() {
		return no_of_branches; 
	}

	public void setno_of_branches(int no_of_branches) {
		this.no_of_branches=no_of_branches;
	}

	public String getproduct() {
		return product;
	}

	public void setproduct(String product) {
		this.product = product;
	}

	
}
