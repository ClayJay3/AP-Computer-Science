package Nine.Eight;

public class Course
{
	/////////////////////////////////////////////////////////////
	///           Create object variables.	                  ///
	/////////////////////////////////////////////////////////////
	private String title;
	private int number;
	private double time;
	private String description;
	private String department;
	
	/////////////////////////////////////////////////////////////
	///           Object Constructor.		                  ///
	/////////////////////////////////////////////////////////////
	public Course(String title, int number, double time, String description, String department)
	{
		this.title = title;
		this.number = number;
		this.time = time;
		this.description = description;
		this.department = department;
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public String getTitle()
	{
		return title;
	}
	public int getNumber()
	{
		return number;
	}
	public double getTime()
	{
		return time;
	}
	public String getDescription()
	{
		return description;
	}
	public String getDepartment()
	{
		return department;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	public void setTime(double time)
	{
		this.time = time;
	}
	public void setDesciption(String description)
	{
		this.description = description;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
}