package Twelve.Nine;

import java.util.Scanner;

public class Driver
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		int userRow = 0;
		PascalTriangle triangle = new PascalTriangle();
		Scanner userInput = new Scanner(System.in);
		
		// Ask user for number of rows.
		System.out.println("Enter the number of rows the program should print for Pascal's Triangle:");
		userRow = userInput.nextInt();
		
		// Make pascals triangle.
		for (int i = 0; i < userRow; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print(triangle.triangle(i, j) + " ");
			}
			System.out.println();
		}
	}
}