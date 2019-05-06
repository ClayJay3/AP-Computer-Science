package Twelve.Elevens;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Elevens
{
	/**************************************************************************
	 * Definition: Elevens Class
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Nothing
	 **************************************************************************/
	public static void main(String[] args)
	{
		// Create objects and variables and arrays.
		String[] suits = {"hearts", "clubs", "spades", "diamonds"};
		String[] rank = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, -1, -2};
		Deck deckOfCards = new Deck(suits, rank, pointValues);
		PushButtonSubmit submitButton = new PushButtonSubmit();
		PushButtonRestart restartButton = new PushButtonRestart();
		submitButton.setCardCount(deckOfCards.size());
		
		// Create and setup the Elevens game window.
		JFrame frame = new JFrame("Elevens");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setResizable(false);
				
		// Create and setup the buttons panel.
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBackground(Color.GRAY);
		buttonsPanel.add(submitButton);
		buttonsPanel.add(restartButton);
				
		// Create and setup the panel for incasing the board and the buttons.
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.DARK_GRAY);
		panel.add(buttonsPanel, BorderLayout.SOUTH);
		
		// Add button to the window.
		frame.add(panel);
		
		// Update window.
		frame.pack();
		frame.setVisible(true);
	}
}