package Five.Four;

import java.util.Random;
import java.util.Scanner;

public class HiLoGame
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		int numberOfTries = 0;
		int userGuess = 0;
		int randomNumber = 0;
		boolean keepLooping = true;
		String hint = "in the correct range";
		String playAgain = "y";
		Random rand = new Random();
		Scanner userInput = new Scanner(System.in);
		
		// Generate first random number.
		randomNumber = rand.nextInt(100) + 1;
		
		// Main loop
		while (keepLooping)
		{
			// Take in the user's number and give hints.
			if (numberOfTries > 0)
			{
				System.out.println();
				System.out.println("You have guessed " + numberOfTries + " times and you need to guess " + hint);
			}
			
			System.out.println("Enter your guess below (zero to stop):");
			userGuess = userInput.nextInt();
			
			if (userGuess == 0)
			{
				keepLooping = false;
			}
			else
			{
				if (userGuess == randomNumber)
				{
					// Increment number of tries for last tries.
					numberOfTries ++;
					// Determine if the user is correct and if they want to play again.
					System.out.println();
					System.out.println("Good Job! You got it in " + numberOfTries + " tries!");
					System.out.println("Do you want to play again? (y/n)");
					userInput.nextLine();
					playAgain = userInput.nextLine();
					keepLooping = playAgain.equalsIgnoreCase("y") ? true : false;
					// Get a new random number and reset data.
					randomNumber = rand.nextInt(100) + 1;
					numberOfTries = 0;
				}
				else
				{
					if (userGuess > 100 || userGuess < 1)
					{
						hint = "in the correct range";
						System.out.println("The number is between 1 and 100.");
						
						// Increment number of tries.
						numberOfTries ++;
					}
					else 
					{
						if (userGuess < randomNumber)
						{
							hint = "higher";
							
							// Increment number of tries.
							numberOfTries ++;
						}
						else
						{
							hint = "lower";
							
							// Increment number of tries.
							numberOfTries ++;
						}	
					}
				}
			}
		}
	}
}