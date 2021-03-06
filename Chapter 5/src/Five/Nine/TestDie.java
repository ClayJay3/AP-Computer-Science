package Five.Nine;

import java.util.Scanner;

public class TestDie
{
	public static void main(String[] args)
	{
		int faceValue = 0;
		boolean keepLooping = true;
		Die die = new Die();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Hit enter to roll the dice.");
		userInput.nextLine();
		die.roll();
		System.out.println("Dice Value: " + die.getFaceValue());
		
		while (keepLooping)
		{
			System.out.println("Enter a new face value from 1 to 6:  (enter 0 to stop the program)");
			faceValue = userInput.nextInt();
			keepLooping = (faceValue == 0) ? false : true;
			die.setFaceValue(faceValue);
			if (!die.getError().contentEquals(""))
			{
				System.out.println(die.getError());
			}
			System.out.println("Die value is: " + die.getFaceValue());
		}
	}
}