package Eleven.One;

public class StringTooLongException extends Exception
{
	// Create objects and variables.
	private int length;
	
	// Object Constructor.
	public StringTooLongException(String message, int length)
	{
		super(message);
		this.length = length;
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