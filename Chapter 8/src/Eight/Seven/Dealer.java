package Eight.Seven;

public class Dealer
{
	public static void main(String[] args)
	{
		// Create deck of cards object.
		DeckOfCards pack1 = new DeckOfCards();
		
		// Manipulate the DeckOfCards object.
		System.out.println("Index of the Ace of Hearts card: ");
		System.out.println(pack1.getCard("A", 'H'));
		System.out.println();
		System.out.println("Normal deck and shuffled deck: ");
		System.out.println(pack1);
		pack1.shuffleDeck();
		System.out.println(pack1);
		System.out.println();
		System.out.println("Index of the Ace of Hearts card: ");
		System.out.println(pack1.getCard("A", 'H'));
		System.out.println();
		pack1.dealCard("K", 'C');
		System.out.println("Is the King of Clubs card dealt?");
		System.out.println(pack1.isCardDealt("K", 'C'));
		System.out.println("Is the Queen of Diamonds dealt?");
		System.out.println(pack1.isCardDealt("Q", 'D'));
		
	}
}