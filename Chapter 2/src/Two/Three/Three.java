package Two.Three;

import java.util.Scanner;

public class Three
{
	public static void main(String[] args)
	{
		double number1 = 0; //float
		double number2 = 0; //float
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type first double.");
		number1 = input.nextDouble();
		System.out.println("Type second double.");
		number2 = input.nextDouble();
		
		float sum = (float) (number1 + number2);
		float difference = (float) (number1 - number2);
		float product = (float) (number1 * number2);
		
		System.out.println();
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);

		
	}
}