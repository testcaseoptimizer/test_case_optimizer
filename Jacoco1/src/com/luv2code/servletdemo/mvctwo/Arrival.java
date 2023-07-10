package com.luv2code.servletdemo.mvctwo;

	public class Arrival
	{
		public String airline;
		public String destination;
		public String time;
		
		public Arrival(String airline,String destination,String time) 
		{
			super();
			this.airline = airline;
			this.destination = destination;
			this.time=time;
		}

		public String getAirline()
		{
			return airline;
		}

		public void setAirline(String airline) 
		{
			
			this.airline = airline;
		}

		

		public String getDestination() 
		{
			return destination;
		}

		public void setDestination(String destination)
		{
			this.destination = destination;
		}
		
		public String gettime()
		{
			return time;
			
		}
		public void settime(String time)
		{
			this.time = time;
		}
		
		
	}




