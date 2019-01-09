package Chapter_7_Project;

public class Die
{
	private final int MAX = 6;
	private int faceValue;
	private int id;
	
	// Create Constructor
	public Die(int id)
	{
		this.id = id;
		roll();
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
		faceValue = value;
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