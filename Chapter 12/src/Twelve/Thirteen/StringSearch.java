package Twelve.Thirteen;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSearch
{	
	/***************************************************************
	 * 
	 * Definition: Main Method
	 * 
	 * Arguments: Nothing
	 * 
	 * Returns: Nothing
	 **************************************************************/
	public static void main(String[] args)
	{
		// Create objects, variables, and arrays.
		ArrayList<String> userStrings = new ArrayList<String>();
		boolean keepReceivingInput = true;
		String searchString = "";
		Scanner userInput = new Scanner(System.in);
		
		// Ask the user to input multiple strings until the program is instructed to stop.
		System.out.println("Enter one string per line for any amount of lines. (enter blank string to stop)");
		while (keepReceivingInput)
		{
			// Ask the user for a string and store it.
			String userString = userInput.nextLine();
			// Convert userString to lowercase.
			userString = userString.toLowerCase();
			
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
		searchString = userInput.nextLine();
		// Convert searchString to lowercase.
		searchString = searchString.toLowerCase();
		
		// Sort the array.
		userStrings.sort(String.CASE_INSENSITIVE_ORDER);
		
		// Find the searchString in userStrings.
		System.out.println();
		if (recursiveSearch(searchString, userStrings))
		{
			System.out.println(searchString + " has been found in the array.");
		}
		else
		{
			System.out.println(searchString + " has not been found in the array.");
		}
	}
	
	/***************************************************************
	 * 
	 * Definition: Searchs a given array for a user given string.
	 * 
	 * Arguments: INT searchString, ARRAYLIST<STRING> userStrings
	 * 
	 * Returns: BOOLEAN isFound
	 **************************************************************/
	public static boolean recursiveSearch(String searchString, ArrayList<String> userStrings)
	{
		// Create and assign variables.
		boolean isFound = false;
		
		// Search the array for the searchString.
		if (userStrings.get(0).equalsIgnoreCase(searchString) || userStrings.get(userStrings.size() - 1).equalsIgnoreCase(searchString))
		{
			isFound = true;
		}
		else
		{
			// Delete the first and last elements of the list if array is bigger than two.
			if (userStrings.size() > 2)
			{
				userStrings.remove(0);
				userStrings.remove(userStrings.size() - 1);
				
				// Recursive call.
				isFound = recursiveSearch(searchString, userStrings);
			}
			else
			{
				// If array has been fully searched and nothing has been found then return false.
				isFound = false;
			}
		}
		
		return isFound;
	}
}