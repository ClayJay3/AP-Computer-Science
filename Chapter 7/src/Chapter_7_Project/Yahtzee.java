package Chapter_7_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class Yahtzee
{
	public static void main(String[] args)
	{
		// Create Objects and Variables.
		ArrayList<Die> cupOfDice = new ArrayList<Die>();
		ArrayList<ArrayList> dicePairs = new ArrayList<ArrayList>();
		int gameCounter = 1;
		int roundCounter = 0;
		int largestPair = 0;
		int numberOfMatchingDice = 0;
		int pointsThisRound = 0;
		int totalScore = 0;
		Die die1 = new Die(1);
		Die die2 = new Die(2);
		Die die3 = new Die(3);
		Die die4 = new Die(4);
		Die die5 = new Die(5);
		cupOfDice.add(die1);
		cupOfDice.add(die2);
		cupOfDice.add(die3);
		cupOfDice.add(die4);
		cupOfDice.add(die5);
		boolean stop = false;
		boolean keepPlaying = true;
		Scanner userInput = new Scanner(System.in);
		
		// Keep playing until game ends or user stops.
		while (keepPlaying && gameCounter <= 5)
		{
			do
			{
				// Start the game.
				System.out.println("Hit enter to roll the 5 dice.");
				userInput.nextLine();
				for (Die die : cupOfDice) { die.roll(); System.out.println("Die" + die.getID() + ": " + die.getFaceValue()); }
				
				// Determine the matching pairs.
				for (Die die : cupOfDice)
				{
					if (die.getFaceValue() != 0)
					{
						ArrayList<Integer> pairs = new ArrayList<Integer>();
						for (Die otherDie : cupOfDice)
						{
							if (otherDie.getFaceValue() != 0)
							{
								if (die.getID() < otherDie.getID())
								{
									if (die.getFaceValue() == otherDie.getFaceValue() && (roundCounter == 0 || pointsThisRound == 0))
									{
										while (!stop)
										{
											pairs.add(die.getFaceValue());
											stop = true;
										}
										pairs.add(otherDie.getFaceValue());
									}
								}
							}
						}
						dicePairs.add(pairs);
						stop = false;
						
						// Add second round dice to pairs.
						if (die.getFaceValue() == largestPair && (roundCounter == 1 || pointsThisRound != 0))
						{
							numberOfMatchingDice ++;
						}
					}
				}

				// Print the dice pairs and keep to largest pair.
				System.out.println();
				System.out.println("Dice pairs found by the program:");
				int diceScore = 0;
				for (ArrayList pairArray : dicePairs)
				{
					for (Object number : pairArray)
					{
						if (roundCounter == 0 || pointsThisRound == 0)
						{
							// Find and determine the largest pair.
							if ((pairArray.size() * (int) number) > diceScore)
							{
								diceScore = (pairArray.size() * (int) number);
								largestPair = (int) number;
								numberOfMatchingDice = pairArray.size();
								System.out.println(pairArray);
								for (int i = 0; i < numberOfMatchingDice; i++)
								{
									cupOfDice.get(i).lock(true);
								}
							}
						}
					}
				}

				// Add points and increment counters.
				pointsThisRound += largestPair * numberOfMatchingDice;
				roundCounter ++;
				
				// Print out user info.
				System.out.println("Largest Dice Pair Value: " + largestPair);
				System.out.println("Number Of Matching Die: " + numberOfMatchingDice);
				System.out.println("Total Number of Points Earned this Round: " + pointsThisRound);
				System.out.println();
				
				// Reset values for next round.
				numberOfMatchingDice = 0;
				dicePairs.clear();
			} while (roundCounter < 2);
			
			// Add points to total game score and reset stuff.
			totalScore += pointsThisRound * 10;
			pointsThisRound = 0;
			largestPair = 0;
			roundCounter = 0;
			for (Die die : cupOfDice) { die.lock(false); }
			
			// Check if the game is over and ask the user if they want to keep playing.
			if (totalScore < 1000 && gameCounter < 5)
			{
				System.out.println();
				System.out.println();
				System.out.println("Round Number: " + gameCounter);
				System.out.println("Total Score for the Game: " + totalScore);
				System.out.println("Do you want to keep playing? (y/n)");
				keepPlaying = (userInput.nextLine().equalsIgnoreCase("y")) ? true : false;
				gameCounter ++;
			}
			else
			{
				if (totalScore >= 1000)
				{
					System.out.println();
					System.out.println();
					System.out.println("You won!");
					System.out.println("Total Points: " + totalScore);
					System.out.println("Rounds Played: " + gameCounter);
					keepPlaying = false;
				}
				else
				{
					System.out.println();
					System.out.println();
					System.out.println("You lost!");
					System.out.println("Total Points: " + totalScore);
					System.out.println("Rounds Played: " + gameCounter);
				}
			}
		}
	}
}