package Nine.Four;

public class Football extends Sport
{
	// Create objects and variables.
	private int inning;
	private int homeScore;
	private int guestScore;
	
	// Constructor.
	public Football(String name, String field, String scoringMethod, int numberOfPlayers, int createdIn)
	{
		super(name, field, scoringMethod, numberOfPlayers, createdIn);
	}
	
	// Class specific methods.
	public void incrementHomeScore()
	{
		homeScore ++;
	}
	public void incrementGuestScore()
	{
		guestScore ++;
	}
	
	// Class specific getters.
	public int getInning()
	{
		return inning;
	}
	public int getHomeScore()
	{
		return homeScore;
	}
	public int getGuestScore()
	{
		return guestScore;
	}
	
	// Class specific setters.
	public void setInning(int inning)
	{
		this.inning = inning;
	}
	public void setHomeScore(int homeScore)
	{
		this.homeScore = homeScore;
	}
	public void setGuestScore(int guestScore)
	{
		this.guestScore = guestScore;
	}
}