package Nine.Six;

public class Math
{
	// Create objects and variables.
	private double length;
	private double width;
	private double depth;
	private double radius;
	private double circumference;
	private double surfaceArea;
	private double area;
	private double volume;
	private String shapeName;
	
	// Class constructor.
	public Math(String shapeName, double length, double width, double depth)
	{
		this.shapeName = shapeName;
		this.length = length;
		this.width = width;
		this.depth = depth;
	}
	public Math(String shapeName, double radius)
	{
		this.shapeName = shapeName;
		this.radius = radius;
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	public double getDepth()
	{
		return depth;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getCircumference()
	{
		return circumference;
	}
	public double getSurfaceArea()
	{
		return surfaceArea;
	}
	public double getArea()
	{
		return area;
	}
	public double getVolume()
	{
		return volume;
	}
	public String getShapeName()
	{
		return shapeName;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public void setLength(double length)
	{
		this.length = length;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public void setDepth(double depth)
	{
		this.depth = depth;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public void setCircumference(double circumference)
	{
		this.circumference = circumference;
	}
	public void setSurfaceArea(double surfaceArea)
	{
		this.surfaceArea = surfaceArea;
	}
	public void setArea(double area)
	{
		this.area = area;
	}
	public void setVolume(double volume)
	{
		this.volume = volume;
	}
	public void setShapeName(String shapeName)
	{
		this.shapeName = shapeName;
	}
}