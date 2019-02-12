package Nine.Two;

public class Receptionist extends Employee
{
	public Receptionist(int id, double salary, double hours, int yearsAtWork, boolean isFullTime, boolean isTrained)
	{
		super(id, salary, hours, yearsAtWork, isFullTime, isTrained);
	}
	
	// Service specific methods.
	public void greet()
	{
		System.out.println("Hello, how may I help you?");
	}
}