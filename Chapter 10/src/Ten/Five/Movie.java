package Ten.Five;

import Ten.Four.Contact;

public class Movie implements Comparable
{
	// Create objects and variables.
	private String name, writer;
	private int year;
	private boolean isGood;
	
	// Object constructor.
	public Movie(String name, String writer, int year, boolean isGood)
	{
		this.name = name;
		this.writer = writer;
		this.year = year;
		this.isGood = isGood;
	}
	
	// CompareTo method for sorting movie titles.
	public int compareTo(Object other)
	{
		int result;

		String otherName = ((Movie)other).getName();
		result = name.compareTo(otherName);

		return result;
	}
	
	// GETTERS
	public String getName()
	{
		return name;
	}
	public String getWriter()
	{
		return writer;
	}
	public int getYear()
	{
		return year;
	}
	public boolean getIsGood()
	{
		return isGood;
	}
	
	// SETTERS
	public void setName(String name)
	{
		this.name = name;
	}
	public void setWriter(String writer)
	{
		this.writer = writer;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	public void setIsGood(boolean isGood)
	{
		this.isGood = isGood;
	}
	
	// objects toString.
	public String toString()
	{
		return name + ", By " + writer + " in " + year;
	}
}