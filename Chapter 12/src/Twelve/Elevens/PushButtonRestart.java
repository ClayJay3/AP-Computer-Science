package Twelve.Elevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushButtonRestart extends JPanel
{
	/**************************************************************************
	 * Definition: Create buttons and labels for the submit button.
	 **************************************************************************/
	private JButton push;
	private Deck deckOfCards;
	private PushButtonSubmit submitButton;
	
	/**************************************************************************
	 * Definition: Restart button constructor.
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Elevens
	 **************************************************************************/
	public PushButtonRestart(Deck deckOfCards, PushButtonSubmit submitButton)
	{
		// Store deckOfCards object and submitButton object.
		this.deckOfCards = deckOfCards;
		this.submitButton = submitButton;
		
		// Initialize the button and add a listener.
		push = new JButton("Restart");
		push.addActionListener(new ButtonListener());
		
		// Set the button size, color and location.
		push.setPreferredSize(new Dimension(100, 50));
		push.setBackground(Color.WHITE);
		
		// Add the button to the JPanel.
		add(push);
	}
	
	/**************************************************************************
	 * Definition: Button listener for the restart button.
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Nothing
	 **************************************************************************/
	private class ButtonListener implements ActionListener
	{
		/**************************************************************************
		 * Definition: shuffle the cards and restart the game.
		 * 
		 * Parameters: ACTIONEVENT event
		 * 
		 * Derived From: Nothing
		 **************************************************************************/
		public void actionPerformed(ActionEvent event)
		{
			deckOfCards.shuffle();
			submitButton.updateCardCount();
			System.out.println("Program restarted");
		}
	}
}