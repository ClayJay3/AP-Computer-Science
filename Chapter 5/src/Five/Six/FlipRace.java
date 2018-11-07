package Five.Six;

import java.util.ArrayList;

public class FlipRace
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		ArrayList<Coin> coins = new ArrayList<Coin>();   //   <----[ arraylist for no reason ]
		Coin coin1 = new Coin(1);
		Coin coin2 = new Coin(2);
		coins.add(coin1);
		coins.add(coin2);
		int numberOfFlips = 0;
		int winner = 0;
		String result = "";
		
		// Flip the coins until one hits heads three times in a row.
		do
		{
			for (Coin coin : coins)
			{
				// Flip the coin.
				coin.flip();
				System.out.println("Flips in row for coin" + coin.getID() + ": " + coin.getFlipsInRow());
				System.out.println("Number of heads for coin" + coin.getID() + ": " + coin.getNumberOfHeads());
				System.out.println("Number of tails for coin" + coin.getID() + ": " + coin.getNumberOfTails());
			}
			
			// Determine which coin won.
			if (coin1.getFlipsInRow() >= 3 && coin2.getFlipsInRow() >= 3)
			{
				result = "tie";
				winner = 1;
			}
			else
			{
				if (coin1.getFlipsInRow() >= 3)
				{
					result = "coin1";
					winner = 1;
				}
				if (coin2.getFlipsInRow() >= 3)
				{
					result = "coin2";
					winner = 1;
				}
			}
			// Increment numberOfFlips.
			numberOfFlips ++;
		} while (winner == 0);
		
		// Print stats to user.
		System.out.println("Winner: " + result);
		System.out.println("Total number of rounds: " + numberOfFlips);
		System.out.println("------Stats for coin1-------");
		System.out.println("Total number of flips on heads: " + coin1.getNumberOfHeads());
		System.out.println("Total number of flips in tails: " + coin1.getNumberOfTails());
		System.out.println("Current flips in row: " + coin1.getFlipsInRow());
		System.out.println("------Stats for coin2-------");
		System.out.println("Total number of flips on heads: " + coin2.getNumberOfHeads());
		System.out.println("Total number of flips in tails: " + coin2.getNumberOfTails());
		System.out.println("Current flips in row: " + coin2.getFlipsInRow());
	}
}