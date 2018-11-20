package Six.Four;

import java.util.Scanner;

public class BottlesOfBeerSong
{
	public static void main(String[] args)
	{
		// Create variables and objects.
		int numberOfBottles = 0;
		Scanner userInput = new Scanner(System.in);
		
		// Ask for the users input and loop through the song.
		System.out.println("Enter amount of verses for the song \"One Hundred Bottles Of Beer\"");
		numberOfBottles = userInput.nextInt();
		
		for (int i = numberOfBottles; i > 0; i--, numberOfBottles --)
		{
			System.out.println(numberOfBottles + " bottle" + ((numberOfBottles > 1) ? "s" : "") + " of beer on the wall\n"
					+ numberOfBottles + " bottle" + ((numberOfBottles > 1) ? "s" : "") + " of beer\n"
					+ "If one of those bottles should happen to fall\n"
					+ (numberOfBottles - 1) + " bottle" + ((numberOfBottles > 1) ? "s" : "") + " of beer on the wall\n");
		}
		
		System.out.println();
		System.out.print("Yay! I hate this song and it's finally over!");
	}
}