package Six.Six;

public class CountFlips
{
	public static void main(String[] args)
	{
		// Create variables and objects.
		Coin dime = new Coin(1);
		
		// Flip the coin 100 times and count the number of heads and tails.
		for (int i = 0; i <= 99; i++)
		{
			dime.flip();
		}
		
		// Print number of heads and tails.
		System.out.println("Number of Heads Flipped: " + dime.getNumberOfHeads());
		System.out.println("Number of Tails Flipped: " + dime.getNumberOfTails());
	}
}