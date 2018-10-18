package Chapter_4_Project;

import java.awt.Point;

public class Line
{
	// Create instance variables.
	private Point point1;
	private Point point2;
	private Point point3;
	private double lineDistance;
	private double pointDistance;
	private double lineSlope;
	private double standardSlope;
	private double perpendicularSlope;
	private double lineYIntercept;
	private double standardYIntercept;
	private double perpendicularYIntercept;
	private double parallelYIntercept;
	
	// Object constructor.
	public Line(Point point1, Point point2)
	{
		this.point1 = point1;
		this.point2 = point2;
	}
	
	// Calculate the distance between the given points.
	public double calculateLineDistance()
	{
		lineDistance = Math.sqrt(Math.pow((point2.x - point1.x), 2.0) + (Math.pow((point2.y - point1.y), 2.0)));
		return lineDistance;
	}
	
	// Calculate distance of a point from the line.
	public double calculatePointDistance(Point point3)
	{
		this.point3 = point3;
		standardSlope = lineSlope * -1;
		standardYIntercept = lineYIntercept * -1;
		pointDistance = Math.abs(((standardSlope * point3.x) + point3.y + standardYIntercept) / Math.sqrt(Math.pow(standardSlope, 2) + 1));
		return pointDistance;
	}
	
	// Calculate the slope of the given line.
	public double calculateSlope()
	{
		lineSlope = (double) (point2.y - point1.y) / (point2.x - point1.x);
		return lineSlope;
	}
	
	// Calculate the Y Intercept of the given line.
	public double calculateYIntercept()
	{
		lineYIntercept = point1.y - (lineSlope * point1.x);
		return lineYIntercept;
	}
	
	// Calculate a line that is perpendicular to the original line based on a given point.
	public String getPerpendicular(Point point3)
	{
		this.point3 = point3;
		perpendicularSlope = Math.pow(lineSlope, -1) * -1;
		perpendicularYIntercept = point3.y - (perpendicularSlope * point3.x);
		return "y=" + perpendicularSlope + "x" + " + " + perpendicularYIntercept;
	}
	
	// Calculate a line that is parallel to the original line based on a given point.
	public String getParallel(Point point3)
	{
		this.point3 = point3;
		parallelYIntercept = point3.y - (lineSlope * point3.x);
		return "y=" + lineSlope + "x" + " + " + parallelYIntercept;
	}
	
	// Calculate and place a circle depending on the given line and the third point.
	public String getTangentCircle(Point point3)
	{
		double radius;
		this.point3 = point3;
		
		radius = calculatePointDistance(point3);
		return "(x-" + point3.x + ")^2 + (y-" + point3.y + ")^2 = " + Math.pow(radius, 2);
	}
	
	// Setters that set point values.
	public void setPoint1(Point point1)
	{
		this.point1 = point1;
	}
	public void setPoint2(Point point2)
	{
		this.point2 = point2;
	}
	public void setPoint3(Point point3)
	{
		this.point3 = point3;
	}
	
	// Getters that returns point values.
	public Point getPoint1()
	{
		return point1;
	}
	public Point getPoint2()
	{
		return point2;
	}
	public Point getPoint3()
	{
		return point3;
	}
	
	// Getter that returns a string that represents the equation of the line y=mx+b.
	public String getEquation()
	{
		return "y=" + lineSlope + "x" + " + " + lineYIntercept;
	}
}