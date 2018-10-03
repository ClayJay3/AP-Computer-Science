package Three.Nine;

import java.util.Random;

public class Nine
{
	public static void main(String[] args)
	{
		int radius = 0;
		int height = 0;
		double volume = 0;
		double surfaceArea = 0;
		Random rand = new Random();
		
		radius = rand.nextInt(20) + 1;
		height = rand.nextInt(20) + 1;
		volume = Math.PI * Math.pow(radius, 2) * height;
		surfaceArea = 2 * Math.PI * radius * height;
		
		System.out.println("Random Radius: " + radius);
		System.out.println("Random Height: " + height);
		System.out.println("Volume: " + volume);
		System.out.println("Surface Area: " + surfaceArea);
		
	}
}