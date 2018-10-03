package Two.Thirteen;

import java.util.Scanner;

public class Thirteen
{
	public static void main(String[] args)
	{
		double decimal = 0.0;
		int numerator = 0;
		int denominator = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter Numerator:");
		numerator = userInput.nextInt();
		System.out.println("Enter Denominator:");
		denominator = userInput.nextInt();
		System.out.println();
		
		decimal = (double) numerator / denominator + 0.0;
		System.out.println(decimal);
	}
}