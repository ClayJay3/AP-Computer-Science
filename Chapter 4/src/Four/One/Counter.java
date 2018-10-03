package Four.One;

public class Counter
{
	// Create instance variables.
	private int count;
	
	// Constructor.
	public Counter()
	{
		count = 0;
	}
	
	// Method that increments the tally counter.
	public void click()
	{
		count += 1;
	}
	
	// Method that gets the current count.
	public int getCount()
	{
		return count;
	}
	
	// Method that resets the tally.
	public void resetCount()
	{
		count = 0;
	}
	
	// Method to covert to string.
	public String toString()
	{
		return count + "";
	}
}