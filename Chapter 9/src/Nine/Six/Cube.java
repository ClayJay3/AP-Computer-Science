package Nine.Six;

public class Cube extends Math
{
	// Constructor.
	public Cube(String shapeName, double length, double width, double depth)
	{
		super(shapeName, length, width, depth);
	}
	
	// Class specific methods.
	public double findArea()
	{
		return super.getLength() * super.getWidth() * super.getDepth();
	}
	public double findSurfaceArea()
	{
		return super.getLength() * super.getWidth() * 6;
	}
}