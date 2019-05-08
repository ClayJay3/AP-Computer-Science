package ElevensProject;

public class Card
{
	/**************************************************************************
	 *	Create variables and objects for the card class.
	 *************************************************************************/
	private int pointValue;
	private String suit, rank;
	
	/**************************************************************************
	 * Definition: Card class constructor.
	 * 
	 * Parameters: STRING suit, STRING rand, INT pointValue
	 * 
	 * Derived From: Nothing
	 **************************************************************************/
	public Card(String suit, String rank, int pointValue)
	{
		// Initialize class variables.
		this.suit = suit;
		this.rank = rank;
		this.pointValue = pointValue;
	}
	
	/**************************************************************************
	 * Definition: Compare one card to another.
	 * 
	 * Parameters: CARD otherCard
	 * 
	 * Returns: INT compare
	 **************************************************************************/
	public int compareTo(Card otherCard)
	{
		// Create method instance variables.
		int compare = 0; 
		
		// Compare the other card to this one.
		if (otherCard.getPointValue() < pointValue)
		{
			compare = 1;
		}
		else
		{
			if (otherCard.getPointValue() > pointValue)
			{
				compare = -1;
			}
		}
		
		return compare;
	}
	
	/**************************************************************************
	 * Definition: Getter for suit.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: STRING suit
	 **************************************************************************/
	public String getSuit()
	{
		return suit;
	}
	
	/**************************************************************************
	 * Definition: Getter for rank.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: STRING rank
	 **************************************************************************/
	public String getRank()
	{
		return rank;
	}
	
	/**************************************************************************
	 * Definition: Getter for pointValue.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: INT pointValue
	 **************************************************************************/
	public int getPointValue() 
	{
		return pointValue;
	}
	
	/**************************************************************************
	 * Definition: Setter for suit.
	 * 
	 * Parameters: STRING suit
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void setSuit(String suit)
	{
		this.suit = suit;
	}
	
	/**************************************************************************
	 * Definition: Setter for rank.
	 * 
	 * Parameters: STRING rank
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void setRank(String rank)
	{
		this.rank = rank;
	}
	
	/**************************************************************************
	 * Definition: Setter for pointValue.
	 * 
	 * Parameters: INT pointValue
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void setPointValue(int pointValue)
	{
		this.pointValue = pointValue;
	}
	
	/**************************************************************************
	 * Definition: Class toString method.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: STRING toString.
	 **************************************************************************/
	public String toString()
	{
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}