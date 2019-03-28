package Eleven.One;

import java.util.Scanner;

public class RandomStrings
{
	public static void main(String[] args) throws StringTooLongException
	{
		// Create objects and variables.
		String userString = "";
		boolean keepLooping = true;
		Scanner userInput = new Scanner(System.in);
		StringTooLongException problem = new StringTooLongException("ERROR: The string length is too long!", 20);
		
		// Continually accept strings until an error is thrown.
		while(keepLooping)
		{
			// Take in user string.
			System.out.println("Enter any string below 20 characters below:");
			userString = userInput.nextLine();
			
			// Check if the user wants to exit.
			if (userString.contentEquals("DONE"))
			{
				keepLooping = false;
			}
			else
			{
				// Determine if it is too long.
				int counter = 0;
				for (char letter : userString.toCharArray())
				{
					counter ++;
				}
				
				// Print exception and safely exit the program.
				if (counter > problem.getLength())
				{
					keepLooping = false;
					throw problem;
				}
			}
		}
	}
}