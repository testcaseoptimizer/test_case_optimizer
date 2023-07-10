package com.luv2code.servletdemo.mvctwo;

	public class Broker
	{
		public String firstName;
		public String lastName;
		public int age;
		public int bhk;
		
		public Broker(String firstName,String lastName,int age,int bhk) 
		{
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age=age;
			this.bhk=bhk;
		}

		public String getFirstName()
		{
			return firstName;
		}

		public void setFirstName(String firstName) 
		{
			
			this.firstName = firstName;
		}

		public String getLastName() 
		{
			return lastName;
		}

		public void setLastName(String lastName)
		{
			this.lastName = lastName;
		}
		
		public int getage()
		{
			return age;
			
		}
		public void setage(int age)
		{
			this.age = age;
		}
		public int getbhk()
		{
			return bhk;
		}
		public void setbhk(int bhk)
		{
			this.bhk=bhk;
		}
		
		
		
	}





