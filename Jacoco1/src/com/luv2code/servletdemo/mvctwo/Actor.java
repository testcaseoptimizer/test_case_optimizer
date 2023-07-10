
	package com.luv2code.servletdemo.mvctwo;

	public class Actor
	{
		public String firstName;
		public String lastName;
		public int age;
		
		public Actor(String firstName,String lastName,int age) 
		{
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age=age;
		}

		public String getFirstName()
		{
			return firstName;
		}

		public void setName(String firstName) 
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
		
		
	}




