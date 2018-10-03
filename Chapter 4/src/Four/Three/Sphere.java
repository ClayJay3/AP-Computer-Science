package Four.Three;

import java.text.DecimalFormat;

public class Sphere
{
	// Create Instance Variables.
	private double diameter;
	private double radius;
	private double volume;
	private double surfaceArea;
	
	// Create Constructor.
	public Sphere(double diameter)
	{
		this.diameter = diameter;
		radius = this.diameter / 2;
	}
	
	// Method that sets the diameter.
	public void setSphereDiameter(double diameter)
	{
		this.diameter = diameter;
		radius = this.diameter / 2;
	}
	
	// Method that gets the diameter.
	public double getSphereDiameter()
	{
		return diameter;
	}
	
	// Method that calculates the sphere's volume.
	public double sphereVolume()
	{	
		volume = (4.0 * Math.PI * Math.pow(radius, 3)) / 3;
		return volume;
	}
	
	// Method that calculates the spheres's suface area.
	public double sphereSurfaceArea()
	{
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		return surfaceArea;
	}
	
	// Method that return all known info on sphere.
	public String toString()
	{
		DecimalFormat fmt = new DecimalFormat("0.000");
		return "Sphere Diameter is " + fmt.format(diameter) + " meaning that the volume is " + fmt.format(volume) + " and the surface area is " + fmt.format(surfaceArea);
	}
}