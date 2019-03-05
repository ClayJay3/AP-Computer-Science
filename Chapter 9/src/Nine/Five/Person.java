package Nine.Five;

public class Person
{
	// Create objects and variables.
	private String firstName;
	private char middleInitial;
	private String lastName;
	private int age;
	private String nationality;
	private String occupation;
	private double income;
	
	// Constructor.
	public Person(String firstName, char middleInitial, String lastName, int age, String nationality, String occupation, double income)
	{
		this.firstName = firstName;
		this.middleInitial = middleInitial;
		this.lastName = lastName;
		this.age = age;
		this.nationality = nationality;
		this.occupation = occupation;
		this.income = income;
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public String getFirstName()
	{
		return firstName;
	}
	public char getMiddleInitial()
	{
		return middleInitial;
	}
	public String getLastName()
	{
		return lastName;
	}
	public int getAge()
	{
		return age;
	}
	public String getNationality()
	{
		return nationality;
	}
	public String getOccupation()
	{
		return occupation;
	}
	public double getIncome()
	{
		return income;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public void setMiddleInitial(char middleInitial)
	{
		this.middleInitial = middleInitial;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setNationality(String nationality)
	{
		this.nationality = nationality;
	}
	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}
	public void setIncome(double income)
	{
		this.income = income;
	}
}