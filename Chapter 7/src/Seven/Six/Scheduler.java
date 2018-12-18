package Seven.Six;

import java.util.Scanner;

public class Scheduler
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		Task eatBreakfast = new Task("Eat Breakfast", "Saturday", "8 AM", 1, 2);
		Task eatLunch = new Task("Eat Lunch", "Saturday", "12 PM", 2, 5);
		Task eatDinner = new Task("Eat Dinner", "Saturday", "5 PM", 3, 1);
		Scanner userInput = new Scanner(System.in);

		// Manipulate Tasks.
		System.out.println("Enter the complexity of breakfast: (1-10)");
		eatBreakfast.setComplexity(userInput.nextInt());
		System.out.println("Eat Breakfast has a complexity of: " + eatBreakfast.getComplexity());
	}
}