package Nine.Two;

public class Doctor extends Employee
{
	public Doctor(int id, double salary, double hours, int yearsAtWork, boolean isFullTime, boolean isTrained)
	{
		super(id, salary, hours, yearsAtWork, isFullTime, isTrained);
	}
	
	// Service specific methods.
	public void doctorSomething()
	{
		System.out.println("Take these and do this, then come back in a week...");
	}
	public void callNurse()
	{
		System.out.println("Nurse I need a stat, stat!");
	}
}