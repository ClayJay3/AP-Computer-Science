package ElevensProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck
{
	/**************************************************************************
	 *	Create variables, objects, and arrays for the deck class.
	 *************************************************************************/
	private ArrayList<Card> deckOfCards = new ArrayList<Card>();
	private int size;
	
	/**************************************************************************
	 * Definition: Deck class constructor.
	 * 
	 * Parameters: STRINGARRAY suit, STRINGARRAY rank, INTARRAY pointValue
	 * 
	 * Derived From: Nothing
	 **************************************************************************/
	public Deck(String[] suitArray, String[] rankArray, int[] pointValueArray)
	{
		// Use the given suit, rank, and pointArray and store them as cards in the deckOfCards ArrayList.
		for (int i = 0; i < suitArray.length; i++)
		{
			for (int j = 0; j < rankArray.length; j++)
			{
				deckOfCards.add(new Card(suitArray[i], rankArray[j], pointValueArray[j]));
			}
		}
		
		// Set class instance variables.
		size = deckOfCards.size();
		
		// Finally, shuffle the deck of cards.
		shuffle();
	}
	
	/**************************************************************************
	 * Definition: Shuffle the deckOfCards using a selection sort algorithm.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void shuffle()
	{
		// Create method objects and variables.
		Random rand = new Random();
		
		// Set size before reshuffling.
		size = deckOfCards.size();
		
		// Shuffle the deckOfCards.
		for (int i = size - 1; i > 0; i--)
		{
			Collections.swap(deckOfCards, i, rand.nextInt(size - 1));
		}
	}
	
	/**************************************************************************
	 * Definition: Get a card out of deckOfCards.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: CARD card
	 **************************************************************************/
	public Card deal()
	{
		size -= 1;
		return deckOfCards.get(size);
	}
	
	/**************************************************************************
	 * Definition: Return the size of the deckOfCards.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: INT size
	 **************************************************************************/
	public int size()
	{
		return size;
	}
	
	/**************************************************************************
	 * Definition: Returns if the deck is empty.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: BOOLEAN isEmpty
	 **************************************************************************/
	public boolean isEmpty()
	{
		// Create method instance variable.
		boolean isValid = false;
		
		// If the deck is empty return true.
		if (size == 0)
		{
			isValid = true;
		}
		
		return isValid;
	}
}