package Nine.Seven;

public class Computer extends Electronics
{
	// Create objects and variables.
	private String color;
	private String formFactor;
	
	// Constructor.
	public Computer(String color, String formFactor, double weight, double cost, double powerUsage, String manufacturers, String name)
	{
		super(weight, cost, powerUsage, manufacturers, name);
		this.color = color;
		this.formFactor = formFactor;
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public String getColor()
	{
		return color;
	}
	public String getFormFactor()
	{
		return formFactor;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setFormFactor(String formFactor)
	{
		this.formFactor = formFactor;
	}
}