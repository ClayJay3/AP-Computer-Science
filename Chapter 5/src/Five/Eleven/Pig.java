package Five.Eleven;

import java.util.Scanner;

public class Pig
{
	public static void main(String[] args)
	{
		// Create variables and objects.
		int playerTurn = 1;
		int finalComputerScore = 0;
		int finalPlayerScore = 0;
		int playerScore = 0;
		int computerScore = 0;
		boolean keepPlaying = true;
		String winner = "";
		String input = "";
		PairOfDice player = new PairOfDice();
		PairOfDice computer = new PairOfDice();
		Scanner userInput = new Scanner(System.in);
		
		// Main loop
		while (keepPlaying) 
		{	
			playerScore = 0;
			
			// Player One's turn
			while (playerTurn == 1)
			{
				// Print user info.
				System.out.println();
				if (playerScore > 0)
				{
					System.out.println("Total score this round: " + playerScore);
				}
				System.out.println("Press enter to roll your dice.");
				input = userInput.nextLine();
				
				
				// Roll the die.
				player.rollDice();
				System.out.println();
				System.out.println("Your Results:");
				System.out.println("Die1 = " + player.getFirstDiceValue());
				System.out.println("Die2 = " + player.getSecondDiceValue());
				System.out.println();
				
				// Interpret die values and calculate players score.
				if (player.getFirstDiceValue() == 1 && player.getSecondDiceValue() == 1)
				{
					System.out.println("Snake eyes!! You lost all your points!");
					// Reset points and move to computers turn.
					finalPlayerScore = 0;
					playerTurn = 2;
				}
				else
				{
					if (player.getFirstDiceValue() == 1 || player.getSecondDiceValue() == 1)
					{
						System.out.println("Bust!! No points have been awarded!");
						// End of players turn.
						playerScore = 0;
						playerTurn = 2;
					}
					else
					{
						playerScore += player.getFirstDiceValue() + player.getSecondDiceValue();
						System.out.println("You got " + (player.getFirstDiceValue() + player.getSecondDiceValue()) + " points.");
					}
				}
				
				// If player didn't loose control of the dice ask if they want to play again.
				if (playerTurn == 1)
				{
					System.out.println("Roll Again? (y/n)");
					input = userInput.nextLine();
					if (input.equalsIgnoreCase("y"))
					{
						playerTurn = 1;
					}
					else
					{
						playerTurn = 2;
						finalPlayerScore += playerScore;
						System.out.println("Your Score:" + finalPlayerScore);
						System.out.println("Computer Score:" + finalComputerScore);
					}
				}
				
				if (finalPlayerScore >= 100)
				{
					System.out.println("You won!");
					keepPlaying = false;
					break;
				}
			}
			
			System.out.println("Hit enter to start the Computer's turn.");
			userInput.nextLine();
			computerScore = 0;
			
			// Computer's turn
			while (playerTurn == 2)
			{				
				System.out.println("Hit enter to let the Computer's roll the dice.");
				userInput.nextLine();
				computer.rollDice();
				System.out.println();
				System.out.println("Computer's Results:");
				System.out.println("Die1 = " + computer.getFirstDiceValue());
				System.out.println("Die2 = " + computer.getSecondDiceValue());
				System.out.println();
				
				// Interpret die values and calculate players score.
				if (computer.getFirstDiceValue() == 1 && computer.getSecondDiceValue() == 1)
				{
					System.out.println("Snake eyes!! The computer lost all it's points!");
					// Reset points and move to players turn.
					finalComputerScore = 0;
					playerTurn = 1;
				}
				else
				{
					if (computer.getFirstDiceValue() == 1 || computer.getSecondDiceValue() == 1)
					{
						System.out.println("Bust!! No points have been awarded to the computer!");
						// End of computers turn.
						computerScore = 0;
						playerTurn = 1;
					}
					else
					{
						computerScore += computer.getFirstDiceValue() + computer.getSecondDiceValue();
						System.out.println("The Computer got " + (computer.getFirstDiceValue() + computer.getSecondDiceValue()) + " points.");
					}
				}
				
				if (computerScore >= 20 && playerTurn == 2)
				{
					// Move to players turn.
					System.out.println("The Computer ended it's turn.");
					System.out.println();
					finalComputerScore += computerScore;
					playerTurn = 1;
					System.out.println("Your Score:" + finalPlayerScore);
					System.out.println("Computer Score:" + finalComputerScore);
				}
				
				if (finalComputerScore >= 100)
				{
					System.out.println("The computer won!");
					keepPlaying = false;
				}
			}
		}
	}
}