package Three.One;

import java.util.Random;
import java.util.Scanner;

public class One
{
	public static void main(String[] args)
	{
		String firstName = "";
		String newFirst = "";
		String lastName = "";
		String newLast = "";
		int number = 0;
		Random rand = new Random();
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter your first name.");
		firstName = userInput.nextLine();
		System.out.println("Enter your last name.");
		lastName = userInput.nextLine();
		
		newFirst = firstName.substring(0, 1);
		newLast = lastName.substring(0, 5);
		number = rand.nextInt(90) + 10;
		
		System.out.println("Your username is: " + newFirst + newLast + number);
		
	}
}