package Five.Eight;

import java.util.Random;

public class NumberWheel
{
	// Create variables and objects.
	private int number = 0;
	Random rand = new Random();
	
	// Object Constructor.
	public NumberWheel()
	{
		pullLever();
	}
	
	// Operations.
	public int pullLever()
	{
		number = rand.nextInt(10);
		return number;
	}
	
	// Getters
	public int getNumberOnWheel()
	{
		return number;
	}
	
	// Setters
	public void setNumberOnWheel(int number)
	{
		this.number = number;
	}
}