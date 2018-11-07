package Five.One;

import java.util.Scanner;

public class LeapYear
{
	public static void main(String[] args)
	{
		// Create global variables and objects.
		int year = 0;
		boolean isLeapYear = false;
		Scanner userInput = new Scanner(System.in);
		
		// Ask user for a some year.
		System.out.println("Enter a year below:");
		year = userInput.nextInt();
		
		// First, check that the year is over 1582.
		if (year < 1582)
		{
			System.out.println("ERROR: Year is not >= 1582");
		}
		else
		{
			if ((year % 4 == 0) && !(year % 100 == 0) || (year % 4 == 0) && (year % 400 == 0))
			{
				System.out.println(year + " is a leap year.");
			}
			else
			{
				System.out.println(year + " is not a leap year.");
			}
		}
	}
}