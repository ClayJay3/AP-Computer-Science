package Four.Two;

public class Bulb
{
	// Create Instance variables.
	private String currentState;
	
	// Create Constructor
	public Bulb()
	{
		currentState = "OFF";
	}
	
	// Method that turns on light bulb.
	public void on()
	{
		currentState = "ON";
	}
	
	// Method that turns off light bulb.
	public void off()
	{
		currentState = "OFF";
	}
	
	// Method that gets light bulb state.
	public String getBulbState()
	{
		return currentState;
	}
	
	// Create toString
	public String toString()
	{
		return currentState;
	}
}