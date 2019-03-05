package Nine.Five;

public class Mom extends Person
{
	// Constructor.
	public Mom(String firstName, char middleInitial, String lastName, int age, String nationality, String occupation, double income)
	{
		super(firstName, middleInitial, lastName, age, nationality, occupation, income);
	}
	
	// Class specific methods.
	public void doLaundry()
	{
		System.out.println("The laundry is now clean...");
	}
}