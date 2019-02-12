package Nine.Two;

public class Employee
{
	// Create objects and variables.
	private int id;
	private double salary;
	private double hours;
	private int yearsAtWork;
	private boolean isFullTime;
	private boolean isTrained;
	
	// Object Constructor.
	public Employee(int id, double salary, double hours, int yearsAtWork, boolean isFullTime, boolean isTrained)
	{
		this.id = id;
		this.salary = salary;
		this.hours = hours;
		this.yearsAtWork = yearsAtWork;
		this.isFullTime = isFullTime;
		this.isTrained = isTrained;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public void setId(int id)
	{
		this.id = id;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public void setHours(double hours)
	{
		this.hours = hours;
	}
	public void setYearsAtWork(int yearsAtWork)
	{
		this.yearsAtWork = yearsAtWork;
	}
	public void setIsFullTime(boolean isFullTime)
	{
		this.isFullTime = isFullTime;
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public int getId()
	{
		return id;
	}
	public double getSalary()
	{
		return salary;
	}
	public double getHours()
	{
		return hours;
	}
	public int getYearsAtWork()
	{
		return yearsAtWork;
	}
	public boolean getIsFullTime()
	{
		return isFullTime;
	}
}