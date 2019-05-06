package Twelve.Elevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushButtonSubmit extends JPanel
{
	/**************************************************************************
	 * Definition: Create buttons and labels for the submit button.
	 **************************************************************************/
	private JButton push;
	private JLabel cardCountLabel;
	private Deck deckOfCards;
	private static final long serialVersionUID = 1L;	// Graphic class identifier.
	
	/**************************************************************************
	 * Definition: Submit button constructor.
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Elevens
	 **************************************************************************/
	public PushButtonSubmit(Deck deckOfCards)
	{
		// Store deckOfCards object.
		this.deckOfCards = deckOfCards;
		
		// Initialize the button and add a listener.
		push = new JButton("Submit");
		push.addActionListener(new ButtonListener());
		
		// Initialize the cardCount label.
		cardCountLabel = new JLabel("Cards Remaining: " + deckOfCards.size());
		
		// Set the button size, color and location.
		push.setPreferredSize(new Dimension(100, 50));
		push.setBackground(Color.WHITE);
		
		// Add the button to the JPanel.
		add(cardCountLabel);
		add(push);
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
		 * Derived From: Nothing
		 **************************************************************************/
		public void actionPerformed(ActionEvent event)
		{
			// TEMPORARY TEST CODE.
			deckOfCards.deal();
			cardCountLabel.setText("Cards Remaining: " + deckOfCards.size());
			System.out.println("Cards Submitted!");
		}
	}
}