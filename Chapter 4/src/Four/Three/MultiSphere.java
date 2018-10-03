package Four.Three;

public class MultiSphere
{
	public static void main(String[] args)
	{
		// Create object pointers.
		Sphere sphere1 = new Sphere(6);
		Sphere sphere2 = new Sphere(7);
		Sphere sphere3 = new Sphere(8);

		// Set sphere object diameters.
		sphere3.setSphereDiameter(78);
		
		// Print the current diameter, surfaceArea, volume, and definition for all spheres.
		System.out.println("Diameters:");
		System.out.println("Sphere1 Diameter: " + sphere1.getSphereDiameter());
		System.out.println("Sphere2 Diameter: " + sphere2.getSphereDiameter());
		System.out.println("Sphere3 Diameter: " + sphere3.getSphereDiameter());
		System.out.println();
		System.out.println("Calculations:");
		System.out.println("Sphere1 Volume: " + sphere1.sphereVolume());
		System.out.println("Sphere2 Volume: " + sphere2.sphereVolume());
		System.out.println("Sphere3 Volume: " + sphere3.sphereVolume());
		System.out.println("Sphere1 Surface Area: " + sphere1.sphereSurfaceArea());
		System.out.println("Sphere2 Surface Area: " + sphere2.sphereSurfaceArea());
		System.out.println("Sphere3 Surface Area: " + sphere3.sphereSurfaceArea());
		System.out.println();
		System.out.println("Small Description:");
		System.out.println("Sphere1: " + sphere1);
		System.out.println("Sphere2: " + sphere2);
		System.out.println("Sphere3: " + sphere3);
	}
}