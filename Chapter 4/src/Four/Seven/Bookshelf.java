package Four.Seven;

public class Bookshelf
{
	public static void main(String[] args)
	{
		// Create objects.
		Book book1 = new Book("Ready Player One", "some_person", "some_publisher", 2007);
		Book book2 = new Book("The Darkest Minds", "Alexandra Bracken", "Hyperion", 2014);
		
		book1.setDate(2015);
		
		System.out.println(book1);
		System.out.println();
		System.out.println();
		System.out.println("This book is called, \"" + book2.getTitle() + ".\" " + book2.getTitle() + " is written by, " + book2.getAuthor()
				 + "\nand published by, " + book2.getPublisher() + ". This book was written in " + book2.getDate()
				 + "\nand has gained lots of popularity over the years.");
	}
}