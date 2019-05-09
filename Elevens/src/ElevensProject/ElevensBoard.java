package ElevensProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ElevensBoard extends JPanel
{
	/**************************************************************************
	 * 	Create objects, variables, and checkboxes for the board.
	 *************************************************************************/
	private int numberOfCards, selectedPointValue;
	private boolean partyMode;
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
		// Store deckOfCards object and initalize variables.
		this.deckOfCards = deckOfCards;
		selectedPointValue = 0;
		numberOfCards = 0;
		partyMode = false;
		
		// Create and setup the grid layout for checkboxes.
		cardLayoutType = new GridLayout(3, 3);
		cardLayout = new JPanel();
		cardLayout.setLayout(cardLayoutType);
		
		// Add checkbox elements to the layout.
		for (int i = 0; i < 9; i++)
		{
			// Store a card that this checkbox represents.
			Card card = deckOfCards.deal();
			
			// Initialize the checkbox
			checkBoxCards[i] = new JCheckBox();
			checkBoxCards[i].addActionListener(new ButtonListener(checkBoxCards[i], card));
			
			// Open the image, resize it, and then set the icon.
			ImageIcon rawImage = new ImageIcon(ClassLoader.getSystemResource(getIcon(card)));
			Image image = rawImage.getImage();
			Image resizedImage = image.getScaledInstance(100, 145, java.awt.Image.SCALE_SMOOTH);
			ImageIcon cardImage = new ImageIcon(resizedImage);
			checkBoxCards[i].setIcon(cardImage);
			
			// Set size, color, and location.
			checkBoxCards[i].setBackground(Color.GRAY);
			
			// Add the cardCheckBox to the layout.
			cardLayout.add(checkBoxCards[i]);
		}
		
		// Set panel size, color, and location.
		cardLayout.setBackground(Color.GRAY);
		cardLayout.setBorder(BorderFactory.createMatteBorder(50, 400, 500, 400, Color.DARK_GRAY));
		
		// Add the board to the JPanel.
		add(cardLayout);
	}
	
	/**************************************************************************
	 * Definition: Button listener for cards.
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Nothing
	 **************************************************************************/
	private class ButtonListener implements ActionListener
	{
		/**********************************************************************
		 *	Create object and variables for ButtonnListener.
		 *********************************************************************/
		private JCheckBox cardBox;
		private Card card;
		
		/**********************************************************************
		 * Definition: Button Listener Constructor.
		 * 
		 * Parameters: JCHECKBOX cardBox
		 * 
		 * Derived From: ElevensBoard
		 *********************************************************************/
		public ButtonListener(JCheckBox cardBox, Card card)
		{
			this.cardBox = cardBox;
			this.card = card;
		}
		
		/**************************************************************************
		 * Definition: Change color if selected cards and count points.
		 * 
		 * Parameters: ACTIONEVENT event
		 * 
		 * Returns: Nothing
		 **************************************************************************/
		public void actionPerformed(ActionEvent event)
		{
			// Create an abstract button. (This is a work around for an action listener problem)
			AbstractButton abstractButton = (AbstractButton) event.getSource();
			
			// If the checkbox is selected change background to red.
			if (abstractButton.getModel().isSelected())
			{				
				// Set color.
				cardBox.setBackground(Color.RED);
				
				// Add card values to counts.
				numberOfCards++;
				selectedPointValue += card.getPointValue();
			}
			else
			{
				// Set color.
				cardBox.setBackground(Color.GRAY);
				
				// Remove card values to counts.
				numberOfCards--;
				selectedPointValue -= card.getPointValue();
			}
			
			// PARTY MODE.
			if (getPartyMode())
			{
				try 
				{
					partyMode();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	/**************************************************************************
	 * Definition: Show new cards on the board
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void dealCards()
	{
		for (int i = 0; i < 9; i++)
		{
			// If no more cards are left then disable that checkbox.
			if (deckOfCards.size() == 0 && checkBoxCards[i].getBackground() == Color.RED)
			{
				// Disable the card.
				checkBoxCards[i].setEnabled(false);
				
				// Reset the checkbox and remove the action listeners.
				checkBoxCards[i].setSelected(false);
				for (ActionListener actionListener : checkBoxCards[i].getActionListeners())
				{
					checkBoxCards[i].removeActionListener(actionListener);
				}
				
				// Open the image, resize it, and then set the icon.
				ImageIcon rawImage = new ImageIcon(ClassLoader.getSystemResource("b01.png"));
				Image image = rawImage.getImage();
				Image resizedImage = image.getScaledInstance(100, 145, java.awt.Image.SCALE_SMOOTH);
				ImageIcon cardImage = new ImageIcon(resizedImage);
				checkBoxCards[i].setIcon(cardImage);
				
				// Set size, color, and location.
				checkBoxCards[i].setBackground(Color.GRAY);
			}
			else
			{
				// Reset the card checkbox and show a new icon.
				if (checkBoxCards[i].getBackground() == Color.RED)
				{
					// Reset the checkbox and remove the action listeners.
					checkBoxCards[i].setSelected(false);
					for (ActionListener actionListener : checkBoxCards[i].getActionListeners())
					{
						checkBoxCards[i].removeActionListener(actionListener);
					}
					
					// Store the card that this checkbox represents.
					Card card = deckOfCards.deal();
					checkBoxCards[i].addActionListener(new ButtonListener(checkBoxCards[i], card));
					
					// Open the image, resize it, and then set the icon.
					ImageIcon rawImage = new ImageIcon(ClassLoader.getSystemResource(getIcon(card)));
					Image image = rawImage.getImage();
					Image resizedImage = image.getScaledInstance(100, 145, java.awt.Image.SCALE_SMOOTH);
					ImageIcon cardImage = new ImageIcon(resizedImage);
					checkBoxCards[i].setIcon(cardImage);
					
					// Set size, color, and location.
					checkBoxCards[i].setBackground(Color.GRAY);
				}
			}
			
			// PARTY MODE.
			if (getPartyMode())
			{
				try 
				{
					partyMode();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	/**************************************************************************
	 * Definition: Replace all new cards on the board.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void resetBoard()
	{
		// Reset number of cards selected and pointValues.
		setNumberOfCards(0);
		setSelectedPointValue(0);
		
		for (int i = 0; i < 9; i++)
		{
			// Reset the checkbox and remove the action listeners.
			checkBoxCards[i].setEnabled(true);
			checkBoxCards[i].setSelected(false);
			for (ActionListener actionListener : checkBoxCards[i].getActionListeners())
			{
				checkBoxCards[i].removeActionListener(actionListener);
			}
			
			// Store the card that this checkbox represents.
			Card card = deckOfCards.deal();
			checkBoxCards[i].addActionListener(new ButtonListener(checkBoxCards[i], card));
			
			// Open the image, resize it, and then set the icon.
			ImageIcon rawImage = new ImageIcon(ClassLoader.getSystemResource(getIcon(card)));
			Image image = rawImage.getImage();
			Image resizedImage = image.getScaledInstance(100, 145, java.awt.Image.SCALE_SMOOTH);
			ImageIcon cardImage = new ImageIcon(resizedImage);
			checkBoxCards[i].setIcon(cardImage);
			
			// Set size, color, and location.
			checkBoxCards[i].setBackground(Color.GRAY);
		}
	}
	
	/**************************************************************************
	 * Definition: Find the correct icon for a card.
	 * 
	 * Parameters: CARD card
	 * 
	 * Returns: STRING path
	 **************************************************************************/
	private String getIcon(Card card)
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
	
	/**************************************************************************
	 * Definition: Put the board into party mode.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void partyMode() throws InterruptedException
	{
		// Create a random number generator.
		Random rand = new Random();
		int num = 0;
		Color color = Color.BLACK;
		
		for (int i = 0; i < 8; i++)
		{
			// Set all checkBoxes to a random color.
			for (JCheckBox card : checkBoxCards) 
			{
				// Get a random number.
				num = rand.nextInt(6) + 1;
				
				// Get Color.
				switch(num)
				{
					case 1:
						color = Color.RED;
						break;
					case 2:
						color = Color.YELLOW;
						break;
					case 3:
						color = Color.BLUE;
						break;
					case 4:
						color = Color.WHITE;
						break;
					case 5:
						color = Color.PINK;
						break;
					case 6:
						color = Color.GREEN;
						break;
					case 7:
						color = Color.ORANGE;
						break;
				}
				
				// Set background color.
				card.setBackground(color);
			}
		}
	}
	
	/**************************************************************************
	 * Definition: Open a new JFrame with Mr.Jacksons Picture.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void jacksonEasterEgg()
	{
		// Create a new JFrame with jacksons picture.
		JFrame jacksonFrame = new JFrame("Mr.Jackson Easter Egg");
		jacksonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jacksonFrame.setPreferredSize(new Dimension(250, 245));
		jacksonFrame.setResizable(false);
		
		// Add the image to the frame.
		jacksonFrame.add(new JLabel(new ImageIcon(ClassLoader.getSystemResource("myboijackson.png"))));
		
		// Update window.
		jacksonFrame.pack();
		jacksonFrame.setVisible(true);
	}
	
	/**************************************************************************
	 * Definition: Getter for the board.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: JCHECKBOX[] board
	 **************************************************************************/
	public JCheckBox[] getBoard()
	{
		return checkBoxCards;
	}
	
	/**************************************************************************
	 * Definition: Getter for party mode.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: BOOLEAN partyMode
	 **************************************************************************/
	public boolean getPartyMode()
	{
		return partyMode;
	}
	
	/**************************************************************************
	 * Definition: Getter for the number of selected cards.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: INT numberOfCards
	 **************************************************************************/
	public int getNumberOfCards()
	{
		return numberOfCards;
	}
	
	/**************************************************************************
	 * Definition: Getter for the selectedPointValue.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: INT selectedPointValue
	 **************************************************************************/
	public int getSelectedPointValue()
	{
		return selectedPointValue;
	}
	
	/**************************************************************************
	 * Definition: Setter for party mode.
	 * 
	 * Parameters: BOOLEAN partyMode
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void setPartyMode(boolean partyMode)
	{
		this.partyMode = partyMode;
	}
	
	/**************************************************************************
	 * Definition: Setter for the number of selected cards.
	 * 
	 * Parameters: INT numberOfCards
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void setNumberOfCards(int numberOfCards)
	{
		this.numberOfCards = numberOfCards;
	}
	
	/**************************************************************************
	 * Definition: Setter for the selectedPointValue.
	 * 
	 * Parameters: INT numberOfCards
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void setSelectedPointValue(int selectedPointValue)
	{
		this.selectedPointValue = selectedPointValue;
	}
}