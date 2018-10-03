package Two.Nine;

import java.util.Scanner;

public class Nine
{
	public static void main(String[] args)
	{
		int hours = 0;
		int minutes = 0;
		int seconds = 0;
		int inputSeconds = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter number of seconds.");
		inputSeconds = userInput.nextInt();
		hours = inputSeconds / 3600;
		System.out.println("Hours: " + hours);
		minutes = (int) (((inputSeconds / 3600.0) - hours) * 60);
		System.out.println("Minutes: " + minutes);
		float temp = (float) ((((inputSeconds / 3600.0) - hours) * 60.0 - minutes ) * 60);
		seconds = (int) temp;
		System.out.println("Seconds: " + seconds);
	}
}