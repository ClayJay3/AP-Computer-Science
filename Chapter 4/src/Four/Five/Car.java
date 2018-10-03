package Four.Five;

public class Car
{
	// Create Instance Variables.
	private String make;
	private String model;
	private int year;
	
	// Object Constructor.
	public Car(String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	// Method that determines if the car is antique.
	public boolean isAntique()
	{
		boolean isCarAntique = ((2018-year) >= 45);
		
		return isCarAntique;
	}
	
	// Method that sets the cars values.
	public void setCarMake(String make)
	{
		this.make = make;
	}
	public void setCarModel(String model)
	{
		this.model = model;
	}
	public void setCarYear(int year)
	{
		this.year = year;
	}
	
	// Methods that gets the cars values.
	public String getCarMake()
	{
		return make;
	}
	public String getCarModel()
	{
		return model;
	}
	public int getCarYear()
	{
		return year;
	}
	
	// Method for toString.
	public String toString()
	{
		return "This car is a " + year + " " + make + " " + model + "." + " It is also " + isAntique() + " that this car is an antique.";
	}
}