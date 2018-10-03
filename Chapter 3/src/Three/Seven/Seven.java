package Three.Seven;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Seven
{
	public static void main(String[] args)
	{
		double a = 0.0;
		double b = 0.0;
		double c = 0.0;
		double s = 0.0;
		double area = 0.0;
		Scanner userInput = new Scanner(System.in);
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("Type the length of the first side of the triangle.");
		a = userInput.nextDouble();
		System.out.println("Type the length of the second side of the triangle.");
		b = userInput.nextDouble();
		System.out.println("Type the length of the third side of the triangle.");
		c = userInput.nextDouble();
		
		s = (a + b + c) / 2;
		area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
		
		System.out.println("The area of the triangle is: " + fmt.format(area));
		
		
		
	}
}