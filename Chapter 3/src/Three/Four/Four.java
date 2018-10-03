package Three.Four;

import java.util.Scanner;

public class Four
{
	public static void main(String[] args)
	{
		double input = 0.0;
		int low = 0;
		int high = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Type in a number as a double.");
		input = (int) userInput.nextDouble();
		low = (int) input;
		high = (int) input + 1;
		
		System.out.println(low);
		System.out.println(high);
		
	}
}