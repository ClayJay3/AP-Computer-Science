package Twelve.Thirteen;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSearch
{
	public static void main(String[] args)
	{
		// Create objects, variables, and arrays.
		ArrayList<String> userStrings = new ArrayList<String>();
		boolean keepReceivingInput = true;
		Scanner userInput = new Scanner(System.in);
		
		// Ask the user to input multiple strings until the program is instructed to stop.
		System.out.println("Enter one string per line for any amount of lines. (enter black string to stop)");
		while (keepReceivingInput)
		{
			// Ask the user for a string and store it.
			String userString = userInput.nextLine();
			
			// If the string is blank exit and continue.
			if (userString.isBlank())
			{
				keepReceivingInput = false;
			}
			else
			{
				// If the string is not blank add it to the array.
				userStrings.add(userString);
			}
		}
		
		// Ask the user for a search string.
		System.out.println("Enter a search string. (program will search the array for this string)");
		userStrings.sort(c);
	}
}