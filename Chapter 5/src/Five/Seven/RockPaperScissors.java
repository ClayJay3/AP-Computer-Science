package Five.Seven;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		String winner = "";
		String humanValue = "";
		boolean keepLooping = true;
		Scanner userInput = new Scanner(System.in);
		logic game = new logic();

		
		while (keepLooping)
		{
			// Generate new number.
			game.computerShoot();
			
			// Get user input.
			System.out.println("Choose rock, paper, or scissors (exit to stop)");
			humanValue = userInput.nextLine();
			humanValue = humanValue.toLowerCase();
			keepLooping = (humanValue.contentEquals("exit")) ? false : true;
			if (keepLooping == false) { break; }

			// Determine who won.
			winner = game.calculateWinner(humanValue);
			
			// Print info to user.
			System.out.println("Computer Value: " + game.getComputerValue());
			System.out.println("Winner: " + winner);
			System.out.println("Total Wins: " + game.getWins());
			System.out.println("Total Losses: " + game.getLosses());
			System.out.println("Total Ties: " + game.getTies());
			System.out.println();
		}
	}
}