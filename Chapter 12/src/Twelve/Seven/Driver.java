package Twelve.Seven;

import java.util.Random;
import java.util.Scanner;

public class Driver
{
	public static void main(String [] args)
	{
		// Create objects and variables.
		int numberOfBlurbs = 0;
		Blurb blurb = new Blurb(1);
		Random rand = new Random();
		Scanner userInput = new Scanner(System.in);
		
		// Create a random blurb of a random length for however many times the user wants.
		System.out.println("Enter the amount of blurbs you want to make:");
		numberOfBlurbs = userInput.nextInt();
		
		for (int i = 0; i < numberOfBlurbs; i++)
		{
			blurb.setLength(rand.nextInt(10) + 1);
			System.out.println(blurb.Blarble());
		}
	}
}