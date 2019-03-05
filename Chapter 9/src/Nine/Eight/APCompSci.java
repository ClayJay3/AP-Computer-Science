package Nine.Eight;

public class APCompSci extends Course
{
	/////////////////////////////////////////////////////////////
	///           Create object variables	  .               ///
	/////////////////////////////////////////////////////////////
	private int complexity = 10;
	private boolean hasCoding = true;
	
	/////////////////////////////////////////////////////////////
	///           Object Constructor		  .               ///
	/////////////////////////////////////////////////////////////
	public APCompSci(String title, int number, double time, String description, String department)
	{
		// Call Course constuctor.
		super(title, number, time, description, department);
		
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.		  .       ///
	/////////////////////////////////////////////////////////////
	public int getComplexity()
	{
		return complexity;
	}
	public boolean getHasCoding()
	{
		return hasCoding;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.				  ///
	/////////////////////////////////////////////////////////////
	public void setComplexity(int complexity)
	{
		this.complexity = complexity;
	}
	public void setHadCoding(boolean hasCoding)
	{
		this.hasCoding = hasCoding;
	}
}