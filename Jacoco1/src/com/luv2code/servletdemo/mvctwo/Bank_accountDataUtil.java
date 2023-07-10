package com.luv2code.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class Bank_accountDataUtil {

	public static List<Bank_account> getbank_accounts() {
		
		// create an empty list
		List<Bank_account> bank_accounts = new ArrayList<>();
		
		// add sample data
		bank_accounts.add(new Bank_account("Suresh","HDFC" , "Savings Account"));
		bank_accounts.add(new Bank_account("Padma", "ICICI", "Current Account"));
		bank_accounts.add(new Bank_account("Kalyan", "Axis", "Trading account"));
		
		// return the list
		return bank_accounts;
	}
}






