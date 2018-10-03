package Three.Two;

import java.util.Scanner;

public class Two
{
	public static void main(String[] args)
	{
		int firstNumber = 0;
		int secondNumber = 0;
		int finalNumber = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Type first integer.");
		firstNumber = userInput.nextInt();
		System.out.println("Type second integer.");
		secondNumber = userInput.nextInt();
		
		firstNumber = (int) Math.pow(firstNumber, 3);
		secondNumber = (int) Math.pow(secondNumber, 3);
		finalNumber = firstNumber + secondNumber;
		
		System.out.println(finalNumber);
	}
}