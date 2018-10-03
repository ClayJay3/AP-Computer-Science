package Two.Six;

import java.util.Scanner;

public class Six
{
	public static void main(String[] args)
	{
		float miles = 0;
		double kilometers = 0;
		final double CONVERSION_FACTOR = 1.60935;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Type in number of miles.");
		miles = userInput.nextFloat();
		System.out.println();
		System.out.println("The system will now convert to kilometers!");
		kilometers = miles * CONVERSION_FACTOR;
		System.out.println(miles + " miles is " + kilometers + " kilometers");
		
	}
}