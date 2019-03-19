package Ten.Three;

public class Intercom implements Speaker
{
	// Create instance variables.
	private boolean actuallyWorks;
	
	// Object constructor.
	public Intercom(boolean actuallyWorks)
	{
		this.actuallyWorks = actuallyWorks;
	}
	
	// Speak about something.
	public void speak() 
	{
		System.out.println("BEEEEEP!!! (go to next class)");
	}

	// Announce a given sentence.
	public void announce(String str) 
	{
		System.out.println("ANNOUNCEMENT: " + str);
	}
	
	// GETTERS.
	public boolean getActuallyWorks()
	{
		return actuallyWorks;
	}
	
	// SETTERS.
	public void setActuallyWorks(boolean actuallyWorks)
	{
		this.actuallyWorks = actuallyWorks;
	}
}