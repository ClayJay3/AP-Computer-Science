package Eight.Eight;

public class NamePost
{
	// Create variables.
	private String firstName;
	private String lastName;
	private int zip;
	
	// Object Constructor
	public NamePost(String firstName, String lastName, String zip)
	{
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	// Get the person's full name.
	public String getName()
	{
		return firstName + " " + lastName;
	}
	
	// Get the person's zip code.
	public int getZip()
	{
		return zip;
	}
}