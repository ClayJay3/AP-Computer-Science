package Nine.Three;

public class Book extends ReadingMaterial
{
	// Constructor.
	public Book(int numberOfPages, double cost, String title, String topic, String author, String protagonist, String antagonist)
	{
		super(numberOfPages, cost, title, topic, author, protagonist, antagonist);
	}
	
	// Class specific methods.
	public void readBook()
	{
		System.out.println("..." + super.getProtagonist() + " and " + super.getAntagonist() + " lived happily ever after...");
	}
}