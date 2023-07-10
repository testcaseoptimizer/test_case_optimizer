package com.luv2code.servletdemo.mvctwo;

public class QK_employee {

	private String name;
	private String employee_id;
	private String laptop_id;
	
	public QK_employee(String name, String employee_id, String laptop_id) {
		super();
		this.name = name;
		this.employee_id = employee_id;
		this.laptop_id = laptop_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getEmployee_id() {
		return employee_id; 
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id=employee_id;
	}

	public String getlaptop_id() {
		return laptop_id;
	}

	public void setlaptop_id(String laptop_id) {
		this.laptop_id = laptop_id;
	}

	
}
