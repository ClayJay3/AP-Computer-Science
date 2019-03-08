package Ten.Two;

public class Employee extends StaffMember implements Payable
{
	protected String socialSecurityNumber;
	protected int vacationDays;
	protected double payRate;
   
	//-----------------------------------------------------------------
	//  Constructor: Sets up this employee with the specified
	//  information.
	//-----------------------------------------------------------------
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate)
	{
		super(eName, eAddress, ePhone);

		socialSecurityNumber = socSecNumber;
		payRate = rate;
		vacationDays = 14;
	}

	//-----------------------------------------------------------------
	//  Returns information about an employee as a string.
	//-----------------------------------------------------------------
	public String toString()
	{
		String result = super.toString();

		result += "\nVacation Days: " + vacationDays;
		result += "\nSocial Security Number: " + socialSecurityNumber;

		return result;
	}
	
	//-----------------------------------------------------------------
	//  Returns the number of vacation days for this employee.
	//-----------------------------------------------------------------
	public int vacation()
	{
		return vacationDays;
	}
	
	//-----------------------------------------------------------------
	//  Returns the number of vacation days for this employee.
	//-----------------------------------------------------------------
	public void setVacation(int vacationDays)
	{
		this.vacationDays = vacationDays;
	}

	//-----------------------------------------------------------------
	//  Returns the pay rate for this employee.
	//-----------------------------------------------------------------
	public double pay()
	{
		return payRate;
	}
}