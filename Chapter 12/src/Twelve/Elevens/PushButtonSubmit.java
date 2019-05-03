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
	
	/**************************************************************************
	 * Definition: Submit button constructor.
	 * 
	 * Parameters: Nothing
	 * 
	 * Derived From: Nothing
	 **************************************************************************/
	public PushButtonSubmit()
	{
		// Initialize the button and add a listener.
		push = new JButton("Submit");
		push.addActionListener(new ButtonListener());
		
		// Add the button to the JPanel.
		add(push);
		
		// Set the button size, color and location.
		
	}
}