package Two.Ten;

import java.util.Scanner;

public class Ten
{
	public static void main(String[] args)
	{
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		double total = 0.0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter amount of quarters.");
		quarters = userInput.nextInt();
		System.out.println("Enter amount of dimes.");
		dimes = userInput.nextInt();
		System.out.println("Enter amount of nickels.");
		nickels = userInput.nextInt();
		System.out.println("Enter amount of pennies.");
		pennies = userInput.nextInt();
		
		total = total + (quarters * 25);
		total = total + (dimes * 10);
		total = total + (nickels * 5);
		total = total + pennies;
		total = total / 100;
		
		System.out.println("");
		System.out.println("Total amount of money.");
		System.out.println("$" + total);
	}
}