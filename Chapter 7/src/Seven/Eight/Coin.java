package Seven.Eight;

public class Coin implements Lockable
{
	// Create instance variables
	private final int HEADS = 0;
	private int numberOfHeads = 0;
	private int numberOfTails = 0;
	private int numberOfFlipsInRow = 0;
	private int face = 0;
	private int id = 0;
	private int keyPass = 0;
	private boolean isLocked = false;
	
	// Object constructor
	public Coin(int id)
	{
		this.id = id;
	}
	
	// Method that flips the coin.
	public void flip()
	{
		if (!isLocked)
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
		else
		{
			System.out.println("ERROR: This object if locked");
		}
	}
	
	// Method that increments the number of heads in a row.
	private void flipsInRow(boolean reset)
	{
		if (!isLocked)
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
		else
		{
			System.out.println("ERROR: This object is locked");
		}
	}
	
	// Method that counts total number of heads.
	private void countHeads()
	{
		if (!isLocked)
		{
			numberOfHeads ++;
		}
		else
		{
			System.out.println("ERROR: This object is locked");
		}
	}
	
	// Method that counts total number of tails.
	private void countTails()
	{
		if (!isLocked)
		{
			numberOfTails ++;
		}
		else
		{
			System.out.println("ERROR: This object is locked");
		}
	}

	public void lock(int keyPass) 
	{
		if (keyPass == this.keyPass)
		{
			isLocked = true;
		}
		else
		{
			System.out.println("ERROR: Incorrect keyPass");
		}
	}
	
	public void unlock(int keyPass) 
	{
		if (keyPass == this.keyPass)
		{
			isLocked = false;
		}
		else
		{
			System.out.println("ERROR: Incorrect keyPass");
		}
	}
	
	// Setters
	public void setKey(int keyPass) {
		this.keyPass = keyPass;
	}
	
	// Getters
	public boolean isHeads()
	{
		if (!isLocked)
		{
			return (face == HEADS);
		}
		else
		{
			System.out.println("ERROR: This object is locked");
			return false;
		}
	}
	public int getFlipsInRow()
	{
		if (!isLocked)
		{
			return numberOfFlipsInRow;
		}
		else
		{
			System.out.println("ERROR: This object is locked");
			return 0;
		}
	}
	public int getNumberOfHeads()
	{
		if (!isLocked)
		{
			return numberOfHeads;
		}
		else
		{
			System.out.println("ERROR: This object is locked");
			return 0;
		}
	}
	public int getNumberOfTails()
	{
		if (!isLocked)
		{
			return numberOfTails;
		}
		else
		{
			System.out.println("ERROR: This object is locked");
			return 0;
		}
	}
	public int getID()
	{
		if (!isLocked)
		{
			return id;
		}
		else
		{
			System.out.println("ERROR: This object is locked");
			return 0;
		}
	}
	public boolean locked() 
	{
		return isLocked;
	}
	
	// Returns the current face of the coin as a string.
	public String toString()
	{
		if (!isLocked)
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
		else
		{
			return null;
		}
	}
}