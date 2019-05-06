package Twelve.Elevens;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class ElevensBoard extends JPanel
{
	/**************************************************************************
	 * 	Create objects, variables, and checkboxes for the board.
	 *************************************************************************/
	private Deck deckOfCards;
	private JPanel cardLayout;
	private GridLayout cardLayoutType;
	private JCheckBox[] checkBoxCards = new JCheckBox[9];
	private static final long serialVersionUID = 1L;	// Graphic class identifier.
	
	/**************************************************************************
	 * Definition: Elevens Board constructor.
	 * 
	 * Parameters: DECK deckOfCards
	 * 
	 * Derived From: Elevens
	 **************************************************************************/
	public ElevensBoard(Deck deckOfCards) throws IOException
	{
		// Store deckOfCards object.
		this.deckOfCards = deckOfCards;
		
		// Create and setup the grid layout for checkboxes.
		cardLayoutType = new GridLayout(3, 3);
		cardLayout = new JPanel();
		cardLayoutType.setHgap(0);
		cardLayoutType.setVgap(0);
		cardLayout.setLayout(cardLayoutType);
		
		// Add checkbox elements to the layout.
		for (JCheckBox cardBox: checkBoxCards)
		{
			// Initialize the checkbox
			cardBox = new JCheckBox();
			
			// Open the image, resize it, and then set the icon.
			ImageIcon rawImage = new ImageIcon("/root/Documents/AP-Computer-Science/Chapter 12/src/Twelve/Elevens/CardImages/" + getIcon(deckOfCards.deal()));
			Image image = rawImage.getImage();
			Image resizedImage = image.getScaledInstance(100, 145, java.awt.Image.SCALE_SMOOTH);
			ImageIcon cardImage = new ImageIcon(resizedImage);
			cardBox.setIcon(cardImage);
			
			// Set size, color, and location.
			cardBox.setBackground(Color.GRAY);
			
			// Add the cardCheckBox to the layout.
			cardLayout.add(cardBox);
		}
		
		// Set panel size, color, and location.
		cardLayout.setBackground(Color.GRAY);
		cardLayout.setBorder(BorderFactory.createMatteBorder(50, 400, 500, 400, Color.DARK_GRAY));
		
		// Add the board to the JPanel.
		add(cardLayout);
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
		String rank = "";
		String suit = "";
		
		// Determine rank.
		switch(card.getPointValue())
		{
			case 1:
				rank = "01";
				break;
			case 2:
				rank = "02";
				break;
			case 3:
				rank = "03";
				break;
			case 4:
				rank = "04";
				break;
			case 5:
				rank = "05";
				break;
			case 6:
				rank = "06";
				break;
			case 7:
				rank = "07";
				break;
			case 8:
				rank = "08";
				break;
			case 9:
				rank = "09";
				break;
			case 10:
				rank = "10";
				break;
			case 11:
				rank = "11";
				break;
			case 12:
				rank = "12";
				break;
			case 13:
				rank = "13";
				break;
		}
		
		// Determine suit.
		switch(card.getSuit())
		{
			case "hearts":
				suit = "h";
				break;
			case "clubs":
				suit = "c";
				break;
			case "spades":
				suit = "s";
				break;
			case "diamonds":
				suit = "d";
				break;
		}
		
		// Output card file name. (complies with the file naming scheme)
		return suit + rank + ".png";
	}
}