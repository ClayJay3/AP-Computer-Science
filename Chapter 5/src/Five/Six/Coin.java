package Five.Six;

public class Coin
{
	// Create instance variables
	private final int HEADS = 0;
	private int numberOfHeads = 0;
	private int numberOfTails = 0;
	private int numberOfFlipsInRow = 0;
	private int face = 0;
	private int id = 0;
	
	// Object constructor
	public Coin(int id)
	{
		//flip();
		this.id = id;
	}
	
	// Method that flips the coin.
	public void flip()
	{
		face = (int) (Math.random() * 2);
		
		if (face == HEADS)
		{
			countHeads();
			flipsInRow(false);
		}
		else
		{
			countTails();
			flipsInRow(true);
		}
	}
	
	// Method that increments the number of heads in a row.
	private void flipsInRow(boolean reset)
	{
		if (reset)
		{
			numberOfFlipsInRow = 0;
		}
		else
		{
			numberOfFlipsInRow ++;
		}
	}
	
	// Method that counts total number of heads.
	private void countHeads()
	{
		numberOfHeads ++;
	}
	
	// Method that counts total number of tails.
	private void countTails()
	{
		numberOfTails ++;
	}

	////////////////////////////////////////////////////////////////
	// 					Getter for coin class.					  //
	////////////////////////////////////////////////////////////////
	public boolean isHeads()
	{
		return (face == HEADS);
	}
	public int getFlipsInRow()
	{
		return numberOfFlipsInRow;
	}
	public int getNumberOfHeads()
	{
		return numberOfHeads;
	}
	public int getNumberOfTails()
	{
		return numberOfTails;
	}
	public int getID()
	{
		return id;
	}
	
	// Returns the current face of the coin as a string.
	public String toString()
	{
		String faceName;
		
		if (face == HEADS)
		{
			faceName = "Heads";
		}
		else 
		{
			faceName = "Tails";
		}
		
		return faceName;
	}
}