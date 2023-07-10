package com.luv2code.servletdemo.mvctwo;

	public class Employee
	{
		public String firstName;
		public String lastName;
		public int  age;
		public String pos;
		
		public Employee(String firstName,String lastName,int age,String pos) 
		{
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.age=age;
			this.pos=pos;
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
		public String getpos()
		{
			return pos;
		}
		public void setpos(String pos)
		{
			this.pos=pos;
		}
		
	}




