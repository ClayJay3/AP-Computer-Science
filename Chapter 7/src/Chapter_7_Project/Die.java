package Chapter_7_Project;

public class Die
{
	private final int MAX = 6;
	private int faceValue;
	private int id;
	private boolean locked;
	
	// Create Constructor
	public Die(int id)
	{
		this.id = id;
		locked = false;
		roll();
	}
	
	// Roll dice
	public int roll()
	{
		if (!locked)
		{
			faceValue = (int) (Math.random() * MAX) + 1;
			return faceValue;
		}
		else
		{
			return 0;
		}
	}
	
	// Reset the dice so its locked.
	public void lock(boolean locked)
	{
		this.locked = locked;
		faceValue = 0;
	}
	
	// Create setters.
	public void setFaceValue(int value)
	{
		if (!locked)
		{
			faceValue = value;
		}
	}
	
	
	// Create getters
	public int getFaceValue()
	{
		return faceValue;
	}
	public int getID()
	{
		return id;
	}
	
	// Create toString.
	public String toString()
	{
		String result = Integer.toString(faceValue);
		return result;
	}
}