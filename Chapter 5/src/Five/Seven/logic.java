package Five.Seven;

import java.util.Random;

public class logic
{
	// Create objects and variables.
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
		humanValue = humanValue.toLowerCase();
		
		
		// Determine winner. (rockToScissors, scissorsToPaper, paperToRock)
		if (humanValue == "rock" && computerValue == "scissors")
		{
			winner = "human";
		}
		else
		{
			if (computerValue == "paper")
			{
				winner = "computer";
			}
			if (humanValue == computerValue)
			{
				winner = "tie";
			}
		}
		if (humanValue == "paper" && computerValue == "rock")
		{
			winner = "human";
		}
		else
		{
			if (computerValue == "scissors")
			{
				winner = "computer";
			}
			if (humanValue == computerValue)
			{
				winner = "tie";
			}
		}
		if (humanValue == "scissors" && computerValue == "paper")
		{
			winner = "human";
		}
		else
		{
			if (computerValue == "rock")
			{
				winner = "computer";
			}
			if (humanValue == computerValue)
			{
				winner = "tie";
			}
		}
		
		return winner;
	}
	
	// Setters
	
	// Getters
	public String getComputerValue()
	{
		return computerValue;
	}
}