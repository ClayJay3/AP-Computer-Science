package Twelve.Elevens;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushButtonSubmit extends JPanel
{
	/**************************************************************************
	 * Definition: Create buttons and labels for the submit button.
	 **************************************************************************/
	private int cardCount = 52;
	private JButton push;
	private JLabel cardCountLabel;
	
	/**************************************************************************
	 * Definition: Submit button constructor.
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Elevens
	 **************************************************************************/
	public PushButtonSubmit()
	{
		// Initialize the button and add a listener.
		push = new JButton("Submit");
		push.addActionListener(new ButtonListener());
		
		// Initialize the cardCount label.
		cardCountLabel = new JLabel("Cards Remaining: " + cardCount);
		
		// Set the button size, color and location.
		push.setPreferredSize(new Dimension(100, 50));
		push.setBackground(Color.WHITE);
		
		// Add the button to the JPanel.
		add(cardCountLabel);
		add(push);
	}
	
	/**************************************************************************
	 * Definition: Getter for cardCount.
	 * 
	 * Parameters: Nothing
	 * 
	 * Returns: INT cardCount
	 **************************************************************************/
	public int getCardCount()
	{
		return cardCount;
	}
	
	/**************************************************************************
	 * Definition: Setter for cardCount.
	 * 
	 * Parameters: INT cardCount
	 * 
	 * Returns: Nothing
	 **************************************************************************/
	public void setCardCount(int cardCount)
	{
		this.cardCount = cardCount;
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
			cardCount--;
			cardCountLabel.setText("Cards Remaining: " + cardCount);
			System.out.println("Cards Submitted!");
		}
	}
}