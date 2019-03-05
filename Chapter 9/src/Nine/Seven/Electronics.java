package Nine.Seven;

public class Electronics
{
	// Create objects and variables.
	private double weight;
	private double cost;
	private double powerUsage;
	private String manufacturers;
	private String name;
	
	// Constructor.
	public Electronics(double weight, double cost, double powerUsage, String manufacturers, String name)
	{
		this.weight = weight;
		this.cost = cost;
		this.powerUsage = powerUsage;
		this.manufacturers = manufacturers;
		this.name = name;
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public double getWeight()
	{
		return weight;
	}
	public double getCost()
	{
		return cost;
	}
	public double getPowerUsage()
	{
		return powerUsage;
	}
	public String getManufacturers()
	{
		return manufacturers;
	}
	public String getName()
	{
		return name;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	public void setPowerUsage(double powerUsage)
	{
		this.powerUsage = powerUsage;
	}
	public void setManufacturers(String manufacturers)
	{
		this.manufacturers = manufacturers;
	}
	public void setName(String name)
	{
		this.name = name;
	}
}