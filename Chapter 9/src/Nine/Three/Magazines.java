package Nine.Three;

public class Magazines extends ReadingMaterial
{
	// Constructor.
	public Magazines(int numberOfPages, double cost, String title, String topic, String author, String protagonist, String antagonist)
	{
		super(numberOfPages, cost, title, topic, author, protagonist, antagonist);
	}
	
	// Class specific methods.
	public void readHeadline()
	{
		System.out.println("This weeks news: " + super.getTitle());
	}
}