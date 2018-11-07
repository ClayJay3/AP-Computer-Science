package Five.Seven;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		String humanValue = "";
		boolean keepLooping = true;
		Scanner userInput = new Scanner(System.in);
		
		while (keepLooping)
		{
		// Get user input.
		System.out.println("Choose rock, paper, or scissors (exit to stop)");
		humanValue = userInput.nextLine();
		keepLooping = (humanValue.equalsIgnoreCase("exit")) ? true : false;
		
		// Determine who won.
		
		}
	}
}