package Nine.Two;

public class Surgeon extends Employee
{
	public Surgeon(int id, double salary, double hours, int yearsAtWork, boolean isFullTime, boolean isTrained)
	{
		super(id, salary, hours, yearsAtWork, isFullTime, isTrained);
	}
	
	// Service specific methods.
	public void doSurgery()
	{
		System.out.println("Snip! Cut! Give me your money!");
	}
}