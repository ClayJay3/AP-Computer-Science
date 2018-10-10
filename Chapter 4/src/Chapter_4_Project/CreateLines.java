package Chapter_4_Project;

import java.awt.Point;
import java.util.Scanner;

public class CreateLines
{
	public static void main(String[] args)
	{
		// Create Object Pointers.
		Scanner userInput = new Scanner(System.in);
		Point point1 = new Point(0, 0);
		Point point2 = new Point(0, 0);
		
		// Create global variables.
		int point1x = 0;
		int point1y = 0;
		int point2x = 0;
		int point2y = 0;
		
		// Ask user for both point locations.
		System.out.println("Enter the x and y of the first point below.");
		point1x = userInput.nextInt();
		point1y = userInput.nextInt();
		point1.setLocation(point1x, point1y);
		System.out.println("Enter the x and y of the second point below.");
		point2x = userInput.nextInt();
		point2y = userInput.nextInt();
		point2.setLocation(point2x, point2y);
		
		// Create a line with the previous point locations.
		Line line = new Line(point1, point2);
	}
}