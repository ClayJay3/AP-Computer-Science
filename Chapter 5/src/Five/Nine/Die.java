package Five.Nine;

public class Die
{
	private final int MAX = 6;
	private int faceValue;
	
	// Create Constructor
	public Die()
	{
		faceValue = 1;
	}
	
	// Roll dice
	public int roll()
	{
		faceValue = (int) (Math.random() * MAX) + 1;
		return faceValue;
	}
	
	// Create setters.
	public void setFaceValue(int value)
	{
		if (value < 6 && value > 1)
		{
			faceValue = value;
		}
	}
	
	// Create getters
	public int getFaceValue()
	{
		return faceValue;
	}
	
	// Create toString.
	public String toString()
	{
		String result = Integer.toString(faceValue);
		return result;
	}
}