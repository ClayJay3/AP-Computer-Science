package Nine.Six;

public class Sphere extends Math
{	
	// Constructor.
	public Sphere(String shapeName, double radius)
	{
		super(shapeName, radius);
	}
	
	// Class specific methods.
	public double findCircumference()
	{
		return 2 * 3.1415 * super.getRadius(); 
	}
	public double findVolume()
	{
		return 4 * 3.1415 * (super.getRadius() * super.getRadius());
	}
}