package Eight.Seven;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DeckOfCards
{
	// Create objects and arrays.
	private int suitCounter = 1;
	private int faceCounter = 0;
	private Card[] cardPack = new Card[52];
	
	// Constructor
	public DeckOfCards()
	{
		// Create 52 Card objects.
		for (int i = 0; i < 52; i++)
		{
			faceCounter ++;
			cardPack[i] = new Card(i, suitCounter, faceCounter);
			
			// Reset faceCounter if above value.
			if (faceCounter == 13)
			{
				faceCounter = 0;
				suitCounter ++;
			}
		}
	}
	
	// Method to set a card value.
	public void setCard(int cardIndex, int suit, int value)
	{
		cardPack[cardIndex - 1].setCardFace(suit, value);
	}
	
	// Method to get a card value.
	public int getCard(String value, char suit)
	{
		// Create variables. 
		int index = -1;
		
		for (Card card : cardPack)
		{
			if (card.getCardFace().contentEquals(value + suit))
			{
				index = card.getIndex();
			}
		}
		
		return index;
 	}
	
	// Suffle the DeckOfCards.
	public void shuffleDeck()
	{
		// Create objects and variables.
		int counter = 0;
		ArrayList<Card> list = new ArrayList<Card>(Arrays.asList(cardPack));
		Collections.shuffle(list);
		
		// Set contents of cardPack equal to list.
		for (Card card : list)
		{
			cardPack[counter] = card;
			counter ++;
		}
	}
	
	// Deal the card.
	public void dealCard(String value, char suit)
	{
		for (Card card : cardPack)
		{
			if (card.getCardFace().contentEquals(value + suit))
			{
				card.dealCard();
			}
		}
	}
	
	// Return if the certain card is dealt.
	public boolean isCardDealt(String value, char suit)
	{
		// Create variables.
		boolean cardIsDealt = false;
		
		for (Card card : cardPack)
		{
			if (card.getCardFace().contentEquals(value + suit))
			{
				cardIsDealt = card.cardIsDealt();
			}
		}
		
		return cardIsDealt;
	}
	
	// Object toString.
	public String toString()
	{
		String toString = "";
		for (Card card : cardPack)
		{
			toString += card + " ";
		}
		return toString;
	}
}