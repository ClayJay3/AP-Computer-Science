package Five.Nine;

public class Die
{
	private final int MAX = 6;
	private int faceValue;
	private String error = "";
	
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
		if (value <= 6 && value >= 1)
		{
			error = "";
			faceValue = value;
		}
		else
		{
			if (value != 0)
			{
				error = "ERROR: Incorrect face value of dice (1-6)";
			}
		}
	}
	
	// Create getters
	public int getFaceValue()
	{
		return faceValue;
	}
	public String getError()
	{
		if (error == "")
		{
			error = "";
			return error;
		}
		else
		{
			return error;
		}
	}
	
	// Create toString.
	public String toString()
	{
		String result = Integer.toString(faceValue);
		return result;
	}
}