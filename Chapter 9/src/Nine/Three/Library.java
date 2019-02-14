package Nine.Three;

public class Library
{
	public static void main(String[] args)
	{
		// Create obects and variables.
		Book TheEyeOfMinds = new Book(500, 13.67, "The Eye of Minds", "Suspense", "James Dashner", "Micheal", "The System");
		Magazines DailyLies = new Magazines(13, 3.42, "Trump did an OOPSIE", "Politics/News", "Poppy Gloria", "The People", "Trump");
		
		// Print some stuff about the book and magazine.
		TheEyeOfMinds.readBook();
		DailyLies.readHeadline();
	}
}