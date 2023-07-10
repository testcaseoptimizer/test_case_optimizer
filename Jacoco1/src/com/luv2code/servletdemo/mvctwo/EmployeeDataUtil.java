package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDataUtil {

	public static List<Employee> getEmployee() {
		
		// create an empty list
		List<Employee> Employees = new ArrayList<>();
		
		// add sample data
		Employees.add(new Employee("Ajit", "Kumar", 58,"CEO"));
		Employees.add(new Employee("Sanjay", "Kapoor", 46,"Senior Manager"));
		Employees.add(new Employee("Aman", "Singh", 38,"Peon"));
		
		// return the list
		return Employees;
	}
}






