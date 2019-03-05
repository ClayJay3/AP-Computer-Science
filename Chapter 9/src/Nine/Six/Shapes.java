package Nine.Six;

public class Shapes
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		Cube cube1 = new Cube("cube boi", 10, 15, 34);
		Sphere ball1 = new Sphere("ball boi", 56.8);
		
		// Do some stuff with the stuff.
		System.out.println("Area of the cube: " + cube1.findArea());
		System.out.println("Surface Area of the cube: " + cube1.findSurfaceArea());
		System.out.println();
		System.out.println("Area of the ball: " + ball1.findVolume());
		System.out.println("Circumference of the ball: " + ball1.findCircumference());
	}
}