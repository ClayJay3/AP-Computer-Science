package Five.Seven;

import java.util.Random;

public class logic
{
	// Create objects and variables.
	private int wins = 0;
	private int losses = 0;
	private int ties = 0;
	private String computerValue = "";
	private String humanValue = "";
	Random rand = new Random();
	
	// Constructor
	public logic()
	{
		computerShoot();
	}
	
	// Methods for Calulations and info generation.
	public void computerShoot()
	{
		int number;
		number = rand.nextInt(3) + 1;
		
		if (number == 1)
		{
			computerValue = "rock";
		}
		if (number == 2)
		{
			computerValue = "paper";
		}
		if (number == 3)
		{
			computerValue = "scissors";
		}
	}
	public String calculateWinner(String humanValue)
	{
		// Create variables.
		String winner = "";
		
		// Determine winner. (rockToScissors, scissorsToPaper, paperToRock)
		if (humanValue.contentEquals("rock") && computerValue == "scissors")
		{
			winner = "human";
			wins ++;
		}
		else
		{
			if (humanValue.contentEquals("rock") && computerValue == "paper")
			{
				winner = "computer";
				losses ++;
			}
			if (humanValue.contentEquals("rock") && computerValue == "rock")
			{
				winner = "tie";
				ties ++;
			}
		}
		if (humanValue.contentEquals("paper") && computerValue == "rock")
		{
			winner = "human";
			wins ++;
		}
		else
		{
			if (humanValue.contentEquals("paper") && computerValue == "scissors")
			{
				winner = "computer";
				losses ++;
			}
			if (humanValue.contentEquals("paper") && computerValue == "paper")
			{
				winner = "tie";
				ties ++;
			}
		}
		if (humanValue.contentEquals("scissors") && computerValue == "paper")
		{

			winner = "human";
			wins ++;
		}
		else
		{
			if (humanValue.contentEquals("scissors") && computerValue == "rock")
			{
				winner = "computer";
				losses ++;
			}
			if (humanValue.contentEquals("scissors") && computerValue == "scissors")
			{
				winner = "tie";
				ties ++;
			}
		}
		
		return winner;
	}
	
	// Getters
	public String getComputerValue()
	{
		return computerValue;
	}
	public int getWins()
	{
		return wins;
	}
	public int getLosses()
	{
		return losses;
	}
	public int getTies()
	{
		return ties;
	}
}