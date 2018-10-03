package Two.Seven;

import java.util.Scanner;

public class Seven
{
	public static void main(String[] args)
	{
		int mphSpeed = 0;
		int mileDistance = 0;
		float totalTime = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Type in speed as an integer. (mph)");
		mphSpeed = userInput.nextInt();
		System.out.println("Type in distance as an integer. (miles)");
		mileDistance = userInput.nextInt();
		System.out.println();
		
		System.out.println("The system will now find total time!");
		totalTime = (float) mileDistance / mphSpeed;
		System.out.println("Total time spent traveling is " + totalTime + " hours.");
	}
}