package Twelve.Two;

import java.util.Scanner;

public class DivisorCalc
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		int num1 = 0;
		int num2 = 0;
		Scanner userInput = new Scanner(System.in);
		
		// Take user input and store it.
		System.out.println("Enter the first integer below:");
		num1 = userInput.nextInt();
		System.out.println("Enter the second integer below:");
		num2 = userInput.nextInt();
		
		// Find the GCD.
		System.out.println("The GCD of the two numbers is: " + gcd(num1, num2));
	}
	
	public static int gcd(int num1, int num2)
	{
		if (num1 == num2 || num1 % num2 == 0)
		{
			return num2;
		}
		else
		{
			return gcd(num2, num1 % num2);
		}
	}
}