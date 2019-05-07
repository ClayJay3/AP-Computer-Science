package Twelve.Elevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushButtonSubmit extends JPanel
{
	/**************************************************************************
	 *	Create buttons and labels for the submit button.
	 **************************************************************************/
	private JButton push;
	private JLabel cardCountLabel;
	private Deck deckOfCards;
	private ElevensBoard board;
	private static final long serialVersionUID = 1L;	// Graphic class identifier.
	
	/**************************************************************************
	 * Definition: Submit button constructor.
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Elevens
	 **************************************************************************/
	public PushButtonSubmit(Deck deckOfCards, ElevensBoard board)
	{
		// Store deckOfCards object.
		this.deckOfCards = deckOfCards;
		this.board = board;
		
		// Initialize the button and add a listener.
		push = new JButton("Submit");
		push.addActionListener(new ButtonListener());
		
		// Initialize the cardCount label.
		cardCountLabel = new JLabel("Cards Remaining: " + deckOfCards.size());
		cardCountLabel.setForeground(Color.RED);
		
		// Set the button size, color and location.
		push.setPreferredSize(new Dimension(100, 50));
		push.setBorder(BorderFactory.createLineBorder(Color.RED));
		push.setBackground(Color.WHITE);
		
		// Set element background color.
		setBackground(Color.GRAY);
		
		// Add the button to the JPanel.
		add(cardCountLabel);
		add(push);
	}
	
	/**************************************************************************
	 * Definition: Button listener for the submit button.
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Nothing
	 **************************************************************************/
	private class ButtonListener implements ActionListener
	{
		/**************************************************************************
		 * Definition: Check the cards and their point values and submit.
		 * 
		 * Parameters: ACTIONEVENT event
		 * 
		 * Returns: Nothing
		 **************************************************************************/
		public void actionPerformed(ActionEvent event)
		{
			//PRINT DEBUG
			System.out.println(board.getNumberOfCards());
			System.out.println(board.getSelectedPointValue());
			
			// Test if the card combo is valid.
			if (board.getNumberOfCards() == 2 && board.getSelectedPointValue() == 11)
			{
				// Reset card counters.
				board.setNumberOfCards(0);
				board.setSelectedPointValue(0);
				
				// Replace selected cards with new ones.
				board.showNewCards();
			}
			else
			{
				if (board.getNumberOfCards() == 3 && board.getSelectedPointValue() == 36)
				{
					// Reset card counters.
					board.setNumberOfCards(0);
					board.setSelectedPointValue(0);
					
					// Replace selected cards with new ones.
					board.showNewCards();
				}
			}
			
			cardCountLabel.setText("Cards Remaining: " + deckOfCards.size());
			System.out.println("Cards Submitted!");
		}
	}
	
	/**************************************************************************
	 * Definition: Update the cardCount to 52.
	 * 
	 * Parameters: Nothing
	 * 
	 * Return: Nothing
	 **************************************************************************/
	public void updateCardCount()
	{
		cardCountLabel.setText("Cards Remaining: " + deckOfCards.size());
	}
}