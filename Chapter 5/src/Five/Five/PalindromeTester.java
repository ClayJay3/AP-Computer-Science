package Five.Five;

import java.util.Scanner;

public class PalindromeTester
{
	public static void main(String[] args)
	{
		// Create variables.
		int left = 0;
		int right = 0;
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
			
			// Setup length stepper.
			left = 0;
			right = palindrome.length() - 1;
			
			while (palindrome.charAt(left) == palindrome.charAt(right) && left < right)
			{
				left ++;
				right --;
			}
			
			// Make stuff look good.
			System.out.println();
			
			// Print palindrome results.
			if (left < right)
			{
				System.out.println("This string is NOT a palindrome.");
			}
			else
			{
				System.out.println("This string is a palindrome.");
			}
			
			// Ask if the user wants to test another string.
			System.out.println();
			System.out.println("Test another palindrome (y/n)?");
			another = userInput.nextLine();
		}
	}
}