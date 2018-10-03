package Two.Twelve;

import java.util.Scanner;

public class Twelve
{
	public static void main(String[] args) 
	{
		double length = 0.0;
		double area = 0.0;
		double perimeter = 0.0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the length of the square's side.");
		length = userInput.nextDouble();
		System.out.println();
		area = length * length;
		perimeter = length * 4;
		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);
	}
}