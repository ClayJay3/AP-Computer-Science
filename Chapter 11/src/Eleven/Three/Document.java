package Eleven.Three;

public class Document
{
	// Create objects and variables.
	private String name, date, author;
	private int pages;
	private char documentCode, identifier;
	private InvalidDocumentCodeException problem = new InvalidDocumentCodeException("ERROR: Invalid document code!");
	
	// Object Constructor.
	public Document(String name, String date, String author, int pages, char documentCode, char identifier) throws InvalidDocumentCodeException
	{
		this.name = name;
		this.date = date;
		this.author = author;
		this.pages = pages;
		setDocumentCode(documentCode);	// Catch any possible exceptions inside the setter.
		this.identifier = identifier;
	}
	
	// GETTERS (mixing it up a bit)
	public String getName() { return name; }
	public String getDate() { return date; }
	public String getAuthor() { return author; }
	public int getPages() { return pages; }
	public char getDocumentCode() { return documentCode; }
	public char getIdentifier() { return identifier; }
	
	// SETTERS (mixing it up a bit)
	public void setName(String name) { this.name = name; }
	public void setDate(String date) { this.date = date; }
	public void setAuthor(String author) { this.author = author; }
	public void setPages(int pages) { this.pages = pages; }
	public void setDocumentCode(char documentCode) throws InvalidDocumentCodeException 
	{ 
		// Determine if the documentCode is invalid.
		if (documentCode != 'U' && documentCode != 'C' && documentCode != 'P')
		{
			throw problem;
		}
		else
		{
			this.documentCode = documentCode;
		}
	} 
	public void setIdentifier(char identifier) { this.identifier = identifier; }
	
	// Objects toString.
	public String toString()
	{
		return getName() + "(" + getDocumentCode() + getIdentifier() + ")" + "\nAuthor: " + getAuthor() + "\nDate: " + getDate() + "\nPages: " + getPages() + "\n";
	}
}