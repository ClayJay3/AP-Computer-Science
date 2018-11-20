package Six.One;

import java.util.Scanner;

public class SumRange
{
	public static void main(String[] args)
	{
		// Create variables and objects.
		int number = 0;
		int numCounter = 2;
		Scanner userInput = new Scanner(System.in);
		
		// Take the user input and add up numbers in that range.
		System.out.println("Enter a value above 2:");
		number = userInput.nextInt();
		
		if (number < 2)
		{
			System.out.println("ERROR: Number is not greater than 2!");
		}
		else 
		{
			for (int i = 2; i <= number; i++)
			{
				if (i % 2 == 0 && i != 2)
				{
					numCounter += i;
					System.out.println("i:" + i);
					System.out.println("FinalCounter: " + numCounter);
				}
			}
		}
	}
}