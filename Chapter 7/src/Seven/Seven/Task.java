package Seven.Seven;

public class Task implements Priority, Complexity, Comparable
{
	// Create objects and variables.
	private int priority;
	private int complexity;
	private String date;
	private String time;
	private String taskName;
	
	// Object Constructor
	public Task(String taskName, String date, String time, int priority, int complexity)
	{
		this.taskName = taskName;
		this.date = date;
		this.time = time;
		setPriority(priority);
		setComplexity(complexity);
	}
	
	// Objects Calculation Methods.
	public int compareTo(Object arg0) {
		int result = 0;
		int otherPriority = ((Task) arg0).getPriority();
		
		if (otherPriority > getPriority())
		{
			result = -1;
		}
		if (otherPriority < getPriority())
		{
			result = 1;
		}
		if (otherPriority == getPriority())
		{
			result = 0;
		}
		
		return result;
	}
	
	// Setters
	public void setTaskName(String taskName)
	{
		this.taskName = taskName;
	}
	
	public void setTaskDate(String date)
	{
		this.date = date;
	}
	
	public void setTaskTime(String time)
	{
		this.date = time;
	}
	
	public void setPriority(int priority)
	{
		this.priority = priority;
	}
	
	public void setComplexity(int complexity)
	{
		if (complexity > 10 || complexity < 1)
		{
			this.complexity = 0;
		}
		else
		{
			this.complexity = complexity;
		}
	}
	
	// Getters
	public String getTaskName()
	{
		return taskName;
	}
	
	public String getTaskDate()
	{
		return date;
	}
	
	public String getTaskTime()
	{
		return time;
	}
	
	public int getPriority()
	{
		return priority;
	}
	
	public int getComplexity()
	{
		return complexity;
	}
	
	// ToString for this object.
	public String toString()
	{
		return taskName + " is scheduled for " + time + " on " + date + " and has a priority of " + priority + " with a complexity of " + complexity;
	}
}