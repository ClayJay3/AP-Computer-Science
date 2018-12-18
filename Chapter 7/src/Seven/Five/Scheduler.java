package Seven.Five;

import java.util.Scanner;

public class Scheduler
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		Task eatBreakfast = new Task("Eat Breakfast", "Saturday", "8 AM", 1);
		Task eatLunch = new Task("Eat Lunch", "Saturday", "12 PM", 2);
		Task eatDinner = new Task("Eat Dinner", "Saturday", "5 PM", 3);
		Scanner userInput = new Scanner(System.in);

		// Manipulate Tasks.
		System.out.println(eatBreakfast);
		
		System.out.println("Enter a new name for Eat Lunch:");
		eatLunch.setTaskName(userInput.nextLine());
		System.out.println("Eat Lunch has been set to: " + eatLunch.getTaskName());

		System.out.println("Enter a new priority for Eat Dinner:");
		eatDinner.setPriority(userInput.nextInt());
		System.out.println("Priority of Eat Dinner has been set to: " + eatDinner.getPriority());
	}
}