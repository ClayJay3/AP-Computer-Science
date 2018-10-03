package Four.Four;

public class Dog
{
	// Create instance variables.
	private int age;
	private int dogHumanAge;
	private String name;
	
	// Class Constructor.
	public Dog(int age, String name)
	{
		this.age = age;
		this.name= name;
	}
	
	// Method that calculates the dogs age in people years.
	public int convertDogHumanAge()
	{
		dogHumanAge = this.age * 7;
		return dogHumanAge;
	}
	
	// Method that sets dogs name.
	public void setDogName(String name)
	{
		this.name = name;
	}
	
	// Method that sets dogs age.
	public void setDogAge(int age)
	{
		this.age = age;
	}
	
	// Method that gets dogs name.
	public String getDogName()
	{
		return name;
	}
	
	// Method that gets dogs age.
	public int getDogAge()
	{
		return age;
	}
	
	// Method for toString.
	public String toString()
	{
		return name + " is " + age + " years old, and " + dogHumanAge + " years old in human years.";
	}
}