package Nine.Four;

public class Robotics extends Sport
{
	// Create variables.
	private int blueAllianceScore = 0;
	private int redAllianceScore = 0;
	private int[] blueTeams = new int[3];
	private int[] redTeams = new int[3];
	
	// Constructor.
	public Robotics(String name, String field, String scoringMethod, int numberOfPlayers, int createdIn)
	{
		super(name, field, scoringMethod, numberOfPlayers, createdIn);
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public int getBlueAllianceScore()
	{
		return blueAllianceScore;
	}
	public int getRedAllianceScore()
	{
		return redAllianceScore;
	}
	public int[] getBlueTeams()
	{
		return blueTeams;
	}
	public int[] getRedTeams()
	{
		return redTeams;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public void setBlueAllianceScore(int blueAllianceScore)
	{
		this.blueAllianceScore = blueAllianceScore;
	}
	public void setRedAllianceScore(int redAllianceScore)
	{
		this.redAllianceScore = redAllianceScore;
	}
	public void setBlueTeams(int[] blueTeams)
	{
		this.blueTeams = blueTeams;
	}
	public void setRedTeams(int[] redTeams)
	{
		this.redTeams = redTeams;
	}
}