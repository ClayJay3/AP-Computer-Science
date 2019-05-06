package Twelve.Elevens;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class ElevensBoard extends JPanel
{
	/**************************************************************************
	 * 	Create objects, variables, and checkboxes for the board.
	 *************************************************************************/
	private Deck deckOfCards;
	private JPanel cardLayout;
	private JCheckBox card1, card2, card3, card4, card5, card6, card7, card8, card9;
	
	/**************************************************************************
	 * Definition: Elevens Board constructor.
	 * 
	 * Parameters: DECK deckOfCards
	 * 
	 * Derived From: Elevens
	 **************************************************************************/
	public ElevensBoard(Deck deckOfCards)
	{
		// Store deckOfCards object.
		this.deckOfCards = deckOfCards;
		
		// Create a grid layout of checkboxes.
		card1 = new JCheckBox();
	}
	
	/**************************************************************************
	 * Definition: Find the correct icon for a card.
	 * 
	 * Parameters: CARD card
	 * 
	 * Returns: STRING path
	 **************************************************************************/
	public String getIcon(Card card)
	{
		// Create instance variables.
		String pointValue = "";
		String suit = "";
		
		switch(card.getPointValue())
		{
			case 1:
				pointValue = "01";
				break;
			case 2:
				pointValue = "02";
				break;
			case 3:
				pointValue = "03";
				break;
			case 4:
				pointValue = "04";
				break;
			case 5:
				pointValue = "05";
				break;
			case 6:
				pointValue = "06";
				break;
			case 7:
				pointValue = "07";
				break;
			case 8:
				pointValue = "08";
				break;
			case 9:
				pointValue = "09";
				break;
			case 10:
				pointValue = "10";
				break;
			case 11:
				pointValue = "11";
				break;
			case 12:
				pointValue = "12";
				break;
			case 13:
				pointValue = "13";
				break;
		}
	}
}