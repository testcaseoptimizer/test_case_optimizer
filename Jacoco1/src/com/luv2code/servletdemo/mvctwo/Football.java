package com.luv2code.servletdemo.mvctwo;

public class Football 
{
	public String name;
	public String club;
	public String nationality;
	
	public Football(String name, String club,String nationality) 
	{
		super();
		this.name = name;
		this.club = club;
		this.nationality=nationality;
	}

	public String getName()
	{
		return name;
	}

	public void settName(String name) 
	{
		
		this.name = name;
	}

	

	public String getclub() 
	{
		return club;
	}

	public void setclub(String club)
	{
		this.club = club;
	}
	
	public String getnationality()
	{
		return nationality;
		
	}
	public void setnationality(String nationality)
	{
		this.nationality = nationality;
	}
	
	
}


