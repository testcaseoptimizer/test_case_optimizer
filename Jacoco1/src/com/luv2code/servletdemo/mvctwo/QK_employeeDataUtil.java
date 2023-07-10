package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class QK_employeeDataUtil {

	public static List<QK_employee> getQK_employees() {
		
		// create an empty list
		List<QK_employee> qk_employees = new ArrayList<>();
		
		// add sample data
		qk_employees.add(new QK_employee("Siddhanth","QKCT2060" , "QKNBK4703"));
		qk_employees.add(new QK_employee("Anuraag", "QKCT2061", "QKNBK4704"));
		qk_employees.add(new QK_employee("Girish", "QKCT2059", "QKNBK4702"));
		
		// return the list
		return qk_employees;
	}
}






