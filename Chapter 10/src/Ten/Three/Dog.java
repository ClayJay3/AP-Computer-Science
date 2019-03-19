package Ten.Three;

public class Dog implements Speaker
{
	// Create instance variables.
	private String name, breed;
	private boolean isGoodBoy;
	
	// Object Constructor.
	public Dog(String name, String breeds)
	{
		this.name = name;
		this.breed = breed;
		
		// Always True.
		isGoodBoy = true;
	}
	
	// Speak about something.
	public void speak() 
	{
		System.out.println("WOOF");
	}

	// Announce a given sentence.
	public void announce(String str) 
	{
		System.out.println("ANNOUNCEMENT: " + str);
	}
	
	// GETTERS.
	public String getName()
	{
		return name;
	}
	public String getBreed()
	{
		return breed;
	}
	public boolean getIsGoodBoy()
	{
		return isGoodBoy;
	}
	
	// SETTERS.
	public void setName(String name)
	{
		this.name = name;
	}
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
}