package Eight.Seven;

// Spades, Hearts, Diamonds, Clubs (4)
// Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King (13)

public class Card
{
	// Create variables.
	private int index;
	private int cardSuit;
	private int faceValue;
	private boolean cardIsDealt = false;
	private char suit;
	private String value;
	
	// Constructors
	public Card(int index, int cardSuit, int faceValue)
	{
		this.index = index;
		setCardFace(cardSuit, faceValue);
	}
	
	// Setters
	public void setCardFace(int cardSuit, int faceValue)
	{
		if (cardIsDealt == false)
		{
			// Set the cardIndex
			this.cardSuit = cardSuit;
			this.faceValue = faceValue;
			
			// Switch statement to find the card suit. (eg. S = Spades)
			switch (cardSuit)
			{
			case 1:
				suit = 'S';
				break;
			case 2:
				suit = 'H';
				break;
			case 3:
				suit = 'D';
				break;
			case 4:
				suit = 'C';
				break;
			}
			
			// Switch statement to find the card face value.
			switch (faceValue)
			{
			case 1:
				value = "A";
				break;
			case 2:
				value = "2";
				break;
			case 3:
				value = "3";
				break;
			case 4:
				value = "4";
				break;
			case 5:
				value = "5";
				break;
			case 6:
				value = "6";
				break;
			case 7:
				value = "7";
				break;
			case 8:
				value = "8";
				break;
			case 9:
				value = "9";
				break;
			case 10:
				value = "10";
				break;
			case 11:
				value = "J";
				break;
			case 12:
				value = "Q";
				break;
			case 13:
				value = "K";
				break;
			}
		}	
	}
	
	// Method to deal card.
	public void dealCard()
	{
		if (cardIsDealt == false)
		{
			cardIsDealt = true;
		}
		else
		{
			cardIsDealt = false;
		}
	}
	
	// Return the face of the card.
	public String getCardFace()
	{
		return String.valueOf(value + suit);
	}
	
	// Return the index of the card.
	public int getIndex()
	{
		return index;
	}
	
	// Return is this card has already been dealt.
	public boolean cardIsDealt()
	{
		return cardIsDealt;
	}
	
	// Object toString.
	public String toString()
	{
		return getCardFace();
	}
}