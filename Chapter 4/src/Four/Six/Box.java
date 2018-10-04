package Four.Six;

import java.text.DecimalFormat;

public class Box
{
	// Create instance variables.
	private double height;
	private double width;
	private double depth;
	private boolean isFull;
	
	// Create Constructor.
	public Box(double height, double width, double depth)
	{
		this.height = height;
		this.width = width;
		this.depth = depth;
		isFull = false;
	}
	
	// Create object setters.
	public void setBoxHeight(double height)
	{
		this.height = height;
	}
	public void setBoxWidth(double width)
	{
		this.width = width;
	}
	public void setBoxDepth(double depth)
	{
		this.depth = depth;
	}
	public void setIsFull(boolean isFull)
	{
		this.isFull = isFull;
	}
	
	// Create object getters.
	public double getBoxHeight()
	{
		return height;
	}
	public double getBoxWidth()
	{
		return width;
	}
	public double getBoxDepth()
	{
		return depth;
	}
	public boolean getIsFull()
	{
		return isFull;
	}
	
	// Method for toString.
	public String toString()
	{
		DecimalFormat fmt = new DecimalFormat("0.###");
		return "Box Height:" + fmt.format(height) + " Box Width:" + fmt.format(width) + " Box Depth:" + fmt.format(depth) + " and the box is " + isFull + " that the box is full.";
	}
}