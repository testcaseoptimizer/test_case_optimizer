package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {

	public static List<Student> getStudents() {
		
		// create an empty presenting
		List<Student> students = new ArrayList<>();
		
		// add sample data
		students.add(new Student("Mary", "Public", "mary@luv2code.com"));
		students.add(new Student("Harry", "Doe", "harry@luv2code.com"));
		students.add(new Student("Ajay", "Rao", "ajay@luv2code.com"));
		
		// return the list
		return students;
	}
}







