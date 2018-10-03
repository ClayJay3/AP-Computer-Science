package Two.Eleven;

import java.util.Scanner;

public class Eleven
{
	public static void main(String[] args)
	{
		double amount = 0.0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter amount of any amount of money as a double.");
		amount = userInput.nextDouble();
		amount *= 100;
		
		tens = (int) (amount / 1000);
		amount = amount - (tens * 1000);
		fives = (int) amount / 500;
		amount = amount - (fives * 500);
		ones = (int) amount / 100;
		amount = amount - (ones * 100);
		quarters = (int) amount / 25;
		amount = amount - (quarters * 25);
		dimes = (int) amount / 10;
		amount = amount - (dimes *10);
		nickels = (int) amount / 5;
		amount = amount - (nickels * 5);
		pennies = (int) amount;
		amount = amount - (pennies);
		
		System.out.println("");
		System.out.println("Tens: " + tens);
		System.out.println("Fives: " + fives);
		System.out.println("Ones: " + ones);
		System.out.println("Quarters: " + quarters);
		System.out.println("Dimes: " + dimes);
		System.out.println("Nickels: " + nickels);
		System.out.println("Pennies: " + pennies);
		System.out.println("");
		System.out.println("Remainder: " + amount);
	}
}