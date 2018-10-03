package Three.Six;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Six
{
	public static void main(String[] args)
	{
		double radius = 0.0;
		double volume = 0.0;
		double surfaceArea = 0.0;
		Scanner userInput = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.####");
		
		System.out.println("Type radius of the circle.");
		radius = userInput.nextDouble();
		
		volume = (4 * Math.PI * Math.pow(radius, 3)) / 3;
		surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
		
		System.out.println("Volume: " + fmt.format(volume));
		System.out.println("Surface Area: " + fmt.format(surfaceArea));
	}
}