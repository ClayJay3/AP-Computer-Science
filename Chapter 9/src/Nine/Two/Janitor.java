package Nine.Two;

public class Janitor extends Employee
{
	public Janitor(int id, double salary, double hours, int yearsAtWork, boolean isFullTime, boolean isTrained)
	{
		super(id, salary, hours, yearsAtWork, isFullTime, isTrained);
	}
	
	// Service specific methods.
	public void sweep()
	{
		System.out.println("Broom chicka broom broom!");
	}
}