package Eleven.Four;

public class Cabinet
{
	public static void main(String[] args) throws InvalidDocumentCodeException
	{
		// Create objects and variables.
		Document letter = new Document("Technology", "05/11/03", "Clayton Cowen", 3, 'P', '1');
		Document weapons = new Document("Nuclear Warhead", "01/01/01", "President Trump", 11, 'C', 'X');
		Document book = new Document("History of Our Nation", "04/07/99", "Lewis Croft", 234, 'U', 'Y');
		Document newspaper = new Document("New York Times", "03/29/19", "Random Dude", 14, 'U', 'T');
		
		// Print all the Document Info.
		System.out.println(letter);
		System.out.println(weapons);
		System.out.println(book);
		newspaper.setDocumentCode('N');
		System.out.println(newspaper);
	}
}