package com.luv2code.servletdemo.mvctwo;

	public class Movie
	{
		public String movieName;
		public int boxoffice;
		public int rating;
		
		public Movie(String movieName,int boxoffice,int rating) 
		{
			super();
			this.movieName = movieName;
			this.boxoffice=boxoffice;
			this.rating=rating;
		}

		public String getMovieName()
		{
			return movieName;
		}

		public void setMovieName(String movieName) 
		{
			
			this.movieName = movieName;
		}

		public int getboxoffice()
		{
			return boxoffice;
			
		}
		public void setage(int boxoffice)
		{
			this.boxoffice = boxoffice;
		}
		public float getrating()
		{
			return rating;
		}
		public void setrating(int rating)
		{
			this.rating=rating;
		
		}
}





