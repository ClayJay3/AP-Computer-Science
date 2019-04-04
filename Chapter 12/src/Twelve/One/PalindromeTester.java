package Twelve.One;

import java.util.Scanner;

public class PalindromeTester
{
	public static void main(String[] args)
	{
		// Create variables.
		boolean isPalindrome = true;
		String palindrome; 
		String another = "y";
		
		Scanner userInput = new Scanner(System.in);
		
		while (another.equalsIgnoreCase("y"))
		{
			System.out.println("Enter a potential palindrome.");
			palindrome = userInput.nextLine();
			
			// Remove spaces and punctuation. 
			palindrome = palindrome.toLowerCase();
			palindrome = palindrome.replaceAll("[^a-zA-Z ]", "");
			if (palindrome.contains(" "))
			{
				palindrome = palindrome.replaceAll(" ", "");
			}
			
			// Test the palindrome.
			isPalindrome = recursivePalindromeTester(palindrome);
			
			// Print palindrome results.
			System.out.println();
			if (isPalindrome)
			{
				System.out.println("This String IS a palindrome!");
			}
			else
			{
				System.out.println("This String IS NOT a palindrome.");
			}
			
			// Ask if the user wants to test another string.
			System.out.println();
			System.out.println("Test another palindrome (y/n)?");
			another = userInput.nextLine();
		}
	}
	
	// Recursive method for testing palindrome.
	public static boolean recursivePalindromeTester(String str)
	{
		// If the string is 1 character long or empty it is a palindrome.
		if (str.length() == 0 || str.length() == 1)
		{
			return true;
		}
		else
		{
			// Test the string for palindromes.
			if (str.charAt(0) == str.charAt(str.length() - 1))
			{
				// Make the method call itself with the new shorter string.
				return recursivePalindromeTester(str.substring(1, str.length() - 1));
			}
		}
		
		// If the string meets none of the above conditions then exit. 
		return false;
	}
}