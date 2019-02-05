package Eight.Nine;

public class NamePost
{
	// Create variables.
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private long phoneNumber;
	private int zip;
	
	// Object Constructor
	public NamePost(String firstName, String lastName, String streetAddress, String city, String state, String phoneNumber, String zip)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.phoneNumber = Long.parseLong(phoneNumber);
		this.zip = Integer.parseInt(zip);
	}
	
	// Set the person's first name.
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	// Set the person's last name.
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	
	// Set the street address.
	public void setStreetAddress(String streetAddress)
	{
		this.streetAddress = streetAddress;
	}
	
	// Set the city.
	public void setCity(String city)
	{
		this.city = city;
	}
	
	// Set the state.
	public void setState(String state)
	{
		this.state = state;
	}
	
	// Set the person's phone number.
	public void setPhoneNumber(int phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	
	// Set the person's zip code.
	public void setZipCode(int zip)
	{
		this.zip = zip;
	}
	
	// Get the person's full name.
	public String getName()
	{
		return firstName + " " + lastName;
	}
	
	// Get the person's street address.
	public String getStreetAddress()
	{
		return streetAddress;
	}
	
	// Get the person's city.
	public String getCity()
	{
		return city;
	}
	
	// Get the person's state.
	public String getState()
	{
		return state;
	}
	
	// Get the person's phone number.
	public long getPhoneNumber()
	{
		return phoneNumber;
	}
	
	// Get the person's zip code.
	public int getZip()
	{
		return zip;
	}
	
	// Object toString.
	public String toString()
	{
		return firstName + " " + lastName + ", " + streetAddress + ", " + city + ", " + state + ", " + phoneNumber + ", " + zip;
	}
}