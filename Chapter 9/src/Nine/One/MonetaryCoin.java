package Nine.One;

public class MonetaryCoin extends Coin
{
	// Create objects and variables.
	private int value;
	
	// Object Constructor. 
	public MonetaryCoin(int value)
	{
		super();
		this.value = value;
	}
	
	// Set the coins value.
	public void setValue(int value)
	{
		this.value = value;
	}
	
	// Get the coins value.
	public int getValue()
	{
		return value;
	}
}