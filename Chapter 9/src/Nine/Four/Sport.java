package Nine.Four;

public class Sport
{
	// Create objects and variables.
	private String name;
	private String field;
	private String scoringMethod;
	private int numberOfPlayers;
	private int createdIn;
	
	// Constructor.
	public Sport(String name, String field, String scoringMethod, int numberOfPlayers, int createdIn)
	{
		this.name = name;
		this.field = field;
		this.scoringMethod = scoringMethod;
		this.numberOfPlayers = numberOfPlayers;
		this.createdIn = createdIn;
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public String getName()
	{
		return name;
	}
	public String getField()
	{
		return field;
	}
	public String getScoringMethod()
	{
		return scoringMethod;
	}
	public int getNumberOfPlayers()
	{
		return numberOfPlayers;
	}
	public int getCreatedIn()
	{
		return createdIn;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public void setName(String name)
	{
		this.name = name;
	}
	public void setField(String field)
	{
		this.field = field;
	}
	public void setScoringMethod(String scoringMethod)
	{
		this.scoringMethod = scoringMethod;
	}
	public void setNumberOfPlayers(int numberOfPlayers)
	{
		this.numberOfPlayers = numberOfPlayers;
	}
	public void setCreatedIn(int createdIn)
	{
		this.createdIn = createdIn;
	}
}