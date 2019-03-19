package Ten.Three;

public class President implements Speaker
{
	// Create instance variables.
	private int age;
	private String name, catchPhrase;
	
	// Object constructor.
	public President(String name, int age, String catchPhrase)
	{
		this.name = name;
		this.age = age;
		this.catchPhrase = catchPhrase;
	}
	
	// Speak about something.
	public void speak() 
	{
		System.out.println(catchPhrase);
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
	public int getAge()
	{
		return age;
	}
	public String getCatchPhrase()
	{
		return catchPhrase;
	}
	
	// SETTERS.
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setCatchPhrase(String catchPhrase)
	{
		this.catchPhrase = catchPhrase;
	}
	
}