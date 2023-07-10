package com.luv2code.servletdemo.mvctwo;

public class Bank_account {

	private String name;
	private String bank_name;
	private String account_type;
	
	public Bank_account(String name, String bank_name, String account_type) {
		super();
		this.name = name;
		this.bank_name = bank_name;
		this.account_type = account_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
	}

	public String getbank_name() {
		return bank_name; 
	}

	public void setbank_name(String bank_name) {
		this.bank_name=bank_name;
	}

	public String getaccount_type() {
		return account_type;
	}

	public void setaccount_type(String account_type) {
		this.account_type = account_type;
	}

	
}
