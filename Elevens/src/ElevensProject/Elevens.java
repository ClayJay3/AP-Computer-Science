package ElevensProject;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Elevens
{
	/**************************************************************************
	 * Definition: Elevens Class
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Nothing
	 **************************************************************************/
	public static void main(String[] args) throws IOException
	{
		// Create objects and variables and arrays.
		String[] suits = {"hearts", "clubs", "spades", "diamonds"};
		String[] rank = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};
		int[] pointValues = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14};
		Deck deckOfCards = new Deck(suits, rank, pointValues);
		ElevensBoard board = new ElevensBoard(deckOfCards);
		PushButtonSubmit submitButton = new PushButtonSubmit(board);
		PushButtonRestart restartButton = new PushButtonRestart(deckOfCards, submitButton, board);

		// Create and setup the Elevens game window.
		JFrame frame = new JFrame("Elevens Project - Clayton Cowen");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setResizable(false);
		
		// Create and setup the title label.
		JLabel title = new JLabel();
		title.setSize(400, 25);
		title.setLocation(325, 10);
		title.setForeground(Color.RED);
		title.setText("ELEVENS");
		title.setFont(new Font("Arial", Font.BOLD, 32));
		
		// Create and setup the buttons panel.
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBackground(Color.GRAY);
		buttonsPanel.add(submitButton);
		buttonsPanel.add(restartButton);
		
		// Create and setup the panel for incasing the board and the buttons and instructions.
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.setBackground(Color.DARK_GRAY);
		panel.add(title);
		panel.add(buttonsPanel, BorderLayout.SOUTH);
		panel.add(board, BorderLayout.CENTER);
		
		// Add button to the window.
		frame.add(panel);
		
		// Update window.
		frame.pack();
		frame.setVisible(true);
		
		// Show instructions.
		JOptionPane.showMessageDialog(frame, "To Match a Valid Pair of Cards: \n"
				+ "-Select two non-face cards whose values add to 11. \n"
				+ "-Select a group of three cards consisting if a jack, queen, and a king.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
	}
}