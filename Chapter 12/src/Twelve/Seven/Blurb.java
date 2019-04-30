package Twelve.Seven;

import java.util.Random;

public class Blurb
{
	// Create objects and variables.
	private int length = 0;
	Random rand = new Random();
	
	// Constructor.
	public Blurb(int length)
	{
		this.length = length;
	}
	
	// Method that generates a blurb.
	public String Blarble()
	{
		// Create and assign variables.
		String result = "";
		
		// Create the blurb by calling other methods. (whoozit and whatzit)
		if (length > 0)
		{
			length--;
			result += Whoozit();
			result += Whatzit();
		}
		
		return result;
	}
	
	// Woozit method.
	public String Whoozit()
	{
		// Create variables and create random number.
		int num = rand.nextInt(10);
		String result = "x";
		
		// Add N number of y's to the end.
		for (int i = 0; i < num; i++)
		{
			result += "y";
		}
		
		return result;
	}
	
	// Whatzit method.
	public String Whatzit()
	{
		// Generate variables and create random number.
		int num = rand.nextInt(1) + 1;
		String result = "q";
		
		// Add either a 'y' or 'd' to the end of this Whatzit.
		if (num == 0)
		{
			result += "z";
		}
		else
		{
			result += "d";
		}
		
		// Add a whoozit to the end.
		result += Blarble();
		
		return result;
	}
	
	// GETTERS
	public int getLength()
	{
		return length;
	}
	
	// SETTERS
	public void setLength(int length)
	{
		this.length = length;
	}
}