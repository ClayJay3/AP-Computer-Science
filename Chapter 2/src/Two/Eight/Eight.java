package Two.Eight;

import java.util.Scanner;

public class Eight
{
	public static void main(String[] args)
	{
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		int totalSeconds = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter number of hours.");
		hours = userInput.nextInt();
		System.out.println("Enter number of minutes.");
		minutes = userInput.nextInt();
		System.out.println("Enter number of seconds.");
		seconds = userInput.nextInt();
		
		System.out.println();
		System.out.println("The system will now find total seconds!");
		totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
		System.out.println("The total amount of seconds is " + totalSeconds);
	}
}