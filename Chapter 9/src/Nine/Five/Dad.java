package Nine.Five;

public class Dad extends Person
{
	// Constructor.
	public Dad(String firstName, char middleInitial, String lastName, int age, String nationality, String occupation, double income)
	{
		super(firstName, middleInitial, lastName, age, nationality, occupation, income);
	}
	
	// Class specific methods.
	public void doDishes()
	{
		System.out.println("Dishes are now clean...");
	}
	public void fixStuff()
	{
		System.out.println("The stuff is now fixed...");
	}
}