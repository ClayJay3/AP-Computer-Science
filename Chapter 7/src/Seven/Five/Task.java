package Seven.Five;

public class Task implements Priority
{
	// Create objects and variables.
	private int priority;
	private String date;
	private String time;
	private String taskName;
	
	// Object Constructor
	public Task(String taskName, String date, String time, int priority)
	{
		this.taskName = taskName;
		this.date = date;
		this.time = time;
		setPriority(priority);
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
	
	// ToString for this object.
	public String toString()
	{
		return taskName + " is scheduled for " + time + " on " + date + " and has a priority of " + priority;
	}
}