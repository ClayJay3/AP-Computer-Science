package Five.Two;

import java.util.Scanner;

public class LeapYearLoop
{
	public static void main(String[] args)
	{
		// Create global variables and objects.
		String year = "0";
		boolean keepLooping = true;
		Scanner userInput = new Scanner(System.in);
		
		// Main loop for finding leap years.
		while(keepLooping)
		{
			// Ask user for a some year.
			System.out.println("Enter a year below (type exit to stop the program):");
			year = userInput.nextLine();
			
			// First, check the users input and decide if they want to exit.
			if(year.equalsIgnoreCase("exit"))
			{
				keepLooping = false;
			}
			else
			{
				// Check that the year is over 1582.
				if (Integer.parseInt(year) < 1582)
				{
					System.out.println("ERROR: Year is not >= 1582");
				}
				else
				{
					if ((Integer.parseInt(year) % 4 == 0) && !(Integer.parseInt(year) % 100 == 0) || (Integer.parseInt(year) % 4 == 0) && (Integer.parseInt(year) % 400 == 0))
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
	}
}