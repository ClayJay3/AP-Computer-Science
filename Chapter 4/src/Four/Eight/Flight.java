package Four.Eight;

public class Flight
{
	// Create Instance Variables.
	private String flightName;
	private int flightNumber;
	private String origin;
	private String destination;
	
	// Create constructor.
	public Flight(String flightName, int flightNumber, String origin, String destination)
	{
		this.flightName = flightName;
		this.flightNumber = flightNumber;
		this.origin = origin;
		this.destination = destination;
	}
	
	// Method for setters.
	public void setFlightName(String flightName)
	{
		this.flightName = flightName;
	}
	public void setFlightNumber(int flightNumber)
	{
		this.flightNumber = flightNumber;
	}
	public void setOrigin(String origin)
	{
		this.origin = origin;
	}
	public void setDestination(String destination)
	{
		this.destination = destination;
	}
	
	// Method for getters.
	public String getFlightName()
	{
		return flightName;
	}
	public int getFlightNumber()
	{
		return flightNumber;
	}
	public String getOrigin()
	{
		return origin;
	}
	public String getDestination()
	{
		return destination;
	}
	
	// Create toString.
	public String toString()
	{
		return "Flight: " + flightName + " " + flightNumber + " traveling from " + origin + " to " + destination;
	}
}