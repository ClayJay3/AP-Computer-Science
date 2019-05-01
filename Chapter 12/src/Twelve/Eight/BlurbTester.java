package Twelve.Eight;

import java.util.Random;
import java.util.Scanner;

public class BlurbTester
{
	// Create global objects and variables.
	static int verify = 0;
	
	public static void main(String [] args)
	{
		// Create objects and variables.
		String userBlurb = "";
		Scanner userInput = new Scanner(System.in);
		
		// Create a random blurb of a random length for however many times the user wants.
		System.out.println("Enter a potentail blurb for the program to check:");
		userBlurb = userInput.nextLine();
		
		// Remove spaces and punctuation.
		userBlurb = userBlurb.toLowerCase();
		userBlurb = userBlurb.replaceAll("[^a-zA-Z ]", "");
		userBlurb = userBlurb.replaceAll("y", "");
		if (userBlurb.contains(" "))
		{
			userBlurb = userBlurb.replaceAll(" ", "");
		}
		
		System.out.println("Blurb isValid: " + checkBlurb(userBlurb));
	}
	
	// Recursive method for checking a potential blurb.
	public static boolean checkBlurb(String userBlurb)
	{
		// Create instance variables.
		boolean isValid = false;

		if (userBlurb.charAt(0) == 'x' && userBlurb.charAt(userBlurb.length() - 1) == 'x' && verify == 0 && userBlurb.length() > 2)
		{
			isValid = true;
			verify = 1;
		}
		else
		{
			if ((userBlurb.charAt(0) == 'q' && userBlurb.charAt(userBlurb.length() - 1) == 'd') || 
					(userBlurb.charAt(0) == 'q' && userBlurb.charAt(userBlurb.length() - 1) == 'z') && verify >= 1)
			{
				isValid = true;
			}
			else
			{
				isValid = false;
			}
		}
		
		if (userBlurb.length() > 2)
		{
			isValid = checkBlurb(userBlurb.substring(1, userBlurb.length() - 1));
		}
		
		return isValid;
	}
}