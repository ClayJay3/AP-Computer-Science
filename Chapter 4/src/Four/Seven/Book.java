package Four.Seven;

public class Book
{
	// Create Instance Variables.
	private String title;
	private String author;
	private String publisher;
	private int date;
	
	// Create Object Constructor.
	public Book(String title, String author, String publisher, int date)
	{
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.date = date;
	}
	
	// Create setters for variables.
	public void setTitle(String title)
	{
		this.title = title;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public void setPublisher(String publisher)
	{
		this.publisher = publisher;
	}
	public void setDate(int date)
	{
		this.date = date;
	}
	
	// Create getters for variables.
	public String getTitle()
	{
		return title;
	}
	public String getAuthor()
	{
		return author;
	}
	public String getPublisher()
	{
		return publisher;
	}
	public int getDate()
	{
		return date;
	}
	
	// Method for toString.
	public String toString()
	{
		return "This book is called, \"" + title + ".\" " + title + " is written by, " + author
			 + "\nand published by, " + publisher + ". This book was written in " + date
			 + "\nand has gained lots of popularity over the years.";
	}
}