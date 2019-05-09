package ElevensProject;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PushButtonSubmit extends JPanel
{
	/**************************************************************************
	 *	Create buttons and labels for the submit button.
	 **************************************************************************/
	private int cardsLeft;
	private JButton push;
	private JLabel cardCountLabel;
	private ElevensBoard board;
	private static final long serialVersionUID = 1L;	// Graphic class identifier.
	
	/**************************************************************************
	 * Definition: Submit button constructor.
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Elevens
	 **************************************************************************/
	public PushButtonSubmit(ElevensBoard board)
	{
		// Store initialize objects and variable.
		this.board = board;
		cardsLeft = 52;
		
		// Initialize the button and add a listener.
		push = new JButton("Submit");
		push.addActionListener(new ButtonListener());
		
		// Initialize the cardCount label.
		cardCountLabel = new JLabel("Cards Remaining: " + cardsLeft);
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
			// PRINT DEBUG
			System.out.println("Number of Cards Selected: " + board.getNumberOfCards());
			System.out.println("Card Point Values: " + board.getSelectedPointValue());
			
			// Test if the card combo is valid.
			if (board.getNumberOfCards() == 2 && board.getSelectedPointValue() == 11)
			{
				// PRINT DEBUG
				System.out.println("Cards Submitted!");
				
				// Decrement cardsLeft and update label.
				cardsLeft -= 2;
				cardCountLabel.setText("Cards Remaining: " + cardsLeft);
				
				// Reset card counters.
				board.setNumberOfCards(0);
				board.setSelectedPointValue(0);
				
				// Replace selected cards with new ones.
				board.dealCards();
			}
			else
			{
				if (board.getNumberOfCards() == 3 && board.getSelectedPointValue() == 36)
				{
					// PRINT DEBUG
					System.out.println("Cards Submitted!");
					
					// Decrement cardsLeft and update label.
					cardsLeft -= 3;
					cardCountLabel.setText("Cards Remaining: " + cardsLeft);
					
					// Reset card counters.
					board.setNumberOfCards(0);
					board.setSelectedPointValue(0);
					
					// Replace selected cards with new ones.
					board.dealCards();
				}
				else
				{
					// Party Mode.
					if (board.getNumberOfCards() == 9)
					{
						// Set game into party mode.
						board.setPartyMode(true);
						JOptionPane.showMessageDialog(null, "PARTY MODE", "PARTY MODE", JOptionPane.INFORMATION_MESSAGE);
						
						try 
						{
							board.partyMode();
						} 
						catch (InterruptedException e) 
						{
							e.printStackTrace();
						}
					}
					
					// Jackson Easter Egg.
					if (board.getNumberOfCards() == 5)
					{
						board.jacksonEasterEgg();
					}
					
					// PRINT DEBUG
					System.out.println("Cards Not Submitted...");
				}
			}	
			System.out.println();
			
			// Check if cardsLeft is 0 and if the user has won the game.
			if (cardsLeft == 0)
			{
				// Print win message.
				JOptionPane.showMessageDialog(null, "Good job, you won the game! To play again hit the restart button.", "You Won!", JOptionPane.INFORMATION_MESSAGE);
			}
			
			// PARTY MODE.
			if (board.getPartyMode())
			{
				try 
				{
					board.partyMode();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
	
	/**************************************************************************
	 * Definition: Update the cardCount to 52.
	 * 
	 * Parameters: Nothing
	 * 
	 * Return: Nothing
	 **************************************************************************/
	public void resetCardCount()
	{
		cardsLeft = 52;
		cardCountLabel.setText("Cards Remaining: " + cardsLeft);
	}
}