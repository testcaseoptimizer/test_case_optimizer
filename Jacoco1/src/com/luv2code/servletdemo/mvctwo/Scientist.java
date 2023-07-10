package com.luv2code.servletdemo.mvctwo;

public class Scientist 
{
	private String name;
	private String discovery;
	private int yod;//year of discovery or invention
	
	public Scientist(String name, String discovery ,int yod) 
	{
		super();
		this.name = name;
		this.discovery = discovery;
		this.yod=yod;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		
		this.name = name;
	}

	

	public String getdiscovery() 
	{
		return discovery;
	}

	public void setdiscovery(String discovery)
	{
		this.discovery = discovery;
	}
	
	public int getyod()
	{
		return yod;
		
	}
	public void setyod(int yod)
	{
		this.yod = yod;
	}
	
	
}


