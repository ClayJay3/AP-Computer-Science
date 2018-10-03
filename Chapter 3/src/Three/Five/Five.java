package Three.Five;

import java.util.Scanner;

public class Five
{
	public static void main(String[] args)
	{
		double x1 = 0.0;
		double y1 = 0.0;
		double x2 = 0.0;
		double y2 = 0.0;
		double distance = 0.0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Type first x coordinate.");
		x1 = userInput.nextDouble();
		System.out.println("Type first y coordinate.");
		y1 = userInput.nextDouble();
		System.out.println("Type second x coordinate.");
		x2 = userInput.nextDouble();
		System.out.println("Type second y coordinate.");
		y2 = userInput.nextDouble();
		
		distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("The distance is: " + distance);
	}
}