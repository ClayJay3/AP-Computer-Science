package Seven.Seven;

import java.util.Scanner;

public class Scheduler
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		String moreImportantTask = "";
		Task eatBreakfast = new Task("Eat Breakfast", "Saturday", "8 AM", 1, 2);
		Task eatLunch = new Task("Eat Lunch", "Saturday", "12 PM", 2, 5);
		Task eatDinner = new Task("Eat Dinner", "Saturday", "5 PM", 3, 1);
		Scanner userInput = new Scanner(System.in);

		// Manipulate Tasks.
		System.out.println("Enter the priority of " + eatBreakfast.getTaskName() + ":");
		eatBreakfast.setPriority(userInput.nextInt());
		System.out.println("The priority of " + eatBreakfast.getTaskName() + " has been set to: " + eatBreakfast.getPriority());
		
		System.out.println("Enter the priority of " + eatLunch.getTaskName() + ":");
		eatLunch.setPriority(userInput.nextInt());
		System.out.println("The priority of " + eatLunch.getTaskName() + " has been set to: " + eatLunch.getPriority());
		
		// Determine which task has a high priority.
		moreImportantTask = (eatBreakfast.compareTo(eatLunch) == 1) ? "higher" : (eatBreakfast.compareTo(eatLunch) == -1) ? "lower" : "equal";
		System.out.println();
		System.out.println("Lunch Priority: " + eatLunch.getPriority());
		System.out.println("The Priority of " + eatBreakfast.getTaskName() + " compared to " + eatLunch.getTaskName() + " is " + moreImportantTask);
	}
}