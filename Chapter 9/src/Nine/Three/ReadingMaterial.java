package Nine.Three;

public class ReadingMaterial
{
	// Create variables.
	private int numberOfPages;
	private double cost;
	private String title;
	private String topic;
	private String protagonist;
	private String antagonist;
	
	// Constructor
	public ReadingMaterial(int numberOfPages, double cost, String title, String topic, String protagonist, String antagonist)
	{
		this.numberOfPages = numberOfPages;
		this.cost = cost;
		this.title = title;
		this.topic = topic;
		this.protagonist = protagonist;
		this.antagonist = antagonist;
	}
	
	/////////////////////////////////////////////////////////////
	///           Getters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public int getNumberOfPages()
	{
		return numberOfPages;
	}
	public double getCost()
	{
		return cost;
	}
	public String getTitle()
	{
		return title;
	}
	public String getTopic()
	{
		return topic;
	}
	public String getProtagonist()
	{
		return protagonist;
	}
	
	/////////////////////////////////////////////////////////////
	///           Setters for object variables.               ///
	/////////////////////////////////////////////////////////////
	public void setNumberOfPages(int numberOfPages)
	{
		this.numberOfPages = numberOfPages;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setTopic(String topic)
	{
		this.topic = topic;
	}
	public void setProtagonist(String protagonist)
	{
		this.protagonist = protagonist;
	}
	public void setAntagonist(String antagonist)
	{
		this.antagonist = antagonist;
	}
}