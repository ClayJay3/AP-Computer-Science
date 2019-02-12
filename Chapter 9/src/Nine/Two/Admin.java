package Nine.Two;

public class Admin extends Employee
{
	public Admin(int id, double salary, double hours, int yearsAtWork, boolean isFullTime, boolean isTrained)
	{
		super(id, salary, hours, yearsAtWork, isFullTime, isTrained);
	}
	
	// Service specific methods.
	public void administer()
	{
		System.out.println("You there, do something! Work!");
	}
}