package Five.Eight;

import java.util.ArrayList;
import java.util.Scanner;

public class SlotMachine
{
	public static void main(String[] args)
	{
		// Create variables and objects.
		int moneyWon = 0;
		boolean keepPlaying = true;
		String leverInput = "";
		NumberWheel wheel1 = new NumberWheel();
		NumberWheel wheel2 = new NumberWheel();
		NumberWheel wheel3 = new NumberWheel();
		Scanner userInput = new Scanner(System.in);
		
		while (keepPlaying)
		{
			// Wait for user to pull the lever.
			System.out.println("Pull lever when ready (type 'exit' to stop the program)");
			leverInput = userInput.nextLine();
			keepPlaying = (leverInput.equalsIgnoreCase("exit")) ? false : true;
			wheel1.pullLever();
			wheel2.pullLever();
			wheel3.pullLever();
			
			if (keepPlaying)
			{
				if (wheel1.getNumberOnWheel() == wheel2.getNumberOnWheel() && wheel1.getNumberOnWheel() == wheel3.getNumberOnWheel())
				{
					moneyWon = 100;
				}
				else
				{
					if (wheel1.getNumberOnWheel() == wheel2.getNumberOnWheel() || wheel1.getNumberOnWheel() == wheel3.getNumberOnWheel() || wheel2.getNumberOnWheel() == wheel3.getNumberOnWheel())
					{
						moneyWon = 50;
					}
					else
					{
						moneyWon = 0;
					}
				}
				
				// Print info to user.
				System.out.println("Wheel1 Value: " + wheel1.getNumberOnWheel());
				System.out.println("Wheel2 Value: " + wheel2.getNumberOnWheel());
				System.out.println("Wheel3 Value: " + wheel3.getNumberOnWheel());
				System.out.println("Money Awarded: " + moneyWon);	
			}
		}
	}
}