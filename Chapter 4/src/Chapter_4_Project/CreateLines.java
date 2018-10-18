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
		Point point3 = new Point(0, 0);
		
		// Create global variables.
		int point1x = 0;
		int point1y = 0;
		int point2x = 0;
		int point2y = 0;
		int point3x = 0;
		int point3y = 0;
		
		// Ask user for both point locations.
		System.out.println("Enter the x and y of the first point below.");
		point1x = userInput.nextInt();
		point1y = userInput.nextInt();
		point1.setLocation(point1x, point1y);
		System.out.println("Enter the x and y of the second point below.");
		point2x = userInput.nextInt();
		point2y = userInput.nextInt();
		point2.setLocation(point2x, point2y);
		System.out.println("Enter the x and y of the third point below.");
		point3x = userInput.nextInt();
		point3y = userInput.nextInt();
		point3.setLocation(point3x, point3y);
		
		// Create a line with the previous point locations.
		Line line = new Line(point1, point2);
		
		// Manipulate Line object for fun???
		System.out.println("");
		System.out.println("----------<Calculations with Given Info>-----------");
		System.out.println("Distance between given points: " + line.calculateLineDistance());
		System.out.println("Slope of given line: " + line.calculateSlope());
		System.out.println("Y intercept of given line: " + line.calculateYIntercept());
		System.out.println("Final equation of given line: " + line.getEquation());
		System.out.println("---------------------------------------------------");
		System.out.println("-----------------<Other Calculations>--------------");
		System.out.println("Equation of a line perpendicular to the first with a given point: " + line.getPerpendicular(point3));
		System.out.println("Equation of a line parallel to the first with a given point: " + line.getParallel(point3));
		System.out.println("Radius of the tangent circle from a point to a line: " + line.calculatePointDistance(point3));
		System.out.println("Equation of a circle tangent to given line with a center at point3: " + line.getTangentCircle(point3));
		System.out.println("---------------------------------------------------");
		System.out.println();
		System.out.println("toString output: " + line.getEquation());
	}
}