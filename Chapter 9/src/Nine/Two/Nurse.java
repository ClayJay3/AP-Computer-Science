package Nine.Two;

public class Nurse extends Employee
{
	public Nurse(int id, double salary, double hours, int yearsAtWork, boolean isFullTime, boolean isTrained)
	{
		super(id, salary, hours, yearsAtWork, isFullTime, isTrained);
	}
	
	// Service specific methods.
	public void helpDoctor()
	{
		System.out.println("Here's the stat doctor!");
	}
}