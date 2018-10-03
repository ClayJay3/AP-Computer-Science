package Two.Five;

import java.util.Scanner;

public class Five
{
	public static void main(String[] args)
	{
		// Create math variables.
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0 / 5.0;
		
		// Create conversion variables.
		float userFahrenheitInput;
		double celsiusTemp;
		
		// Create scanner.
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter a number in fahrenheit.");
		userFahrenheitInput = userInput.nextFloat();
		System.out.println();
		System.out.println("The system will now convert to celsius!");
		celsiusTemp = (userFahrenheitInput - BASE) / CONVERSION_FACTOR;
		System.out.println(userFahrenheitInput + "F is " + celsiusTemp + "C");
	}
}