package Five.Twelve;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GolfScores
{
	public static void main(String[] args) throws IOException
	{
		// Create variables and objects.
		ArrayList<int[]> scores = new ArrayList<int[]>();
		int player1 = 0;
		int player2 = 0;
		int player3 = 0;
		int player4 = 0;
		int par = 0;
		int smallest = 999;
		int winner = 0;
		String numbers = "";
		Scanner fileScan = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 5/src/Five/Twelve/golfscores.inp"));
		
		// Loop through and print out the information stored in the text file.
		while (fileScan.hasNext())
		{
			// Get the line of numbers.
			numbers = fileScan.nextLine();
			// Split the line into numbers depending on spaces.
			String[] split = numbers.split(" ");
			// Create an int array with the same length as the string array.
			int[] number = new int[split.length];
			// Loop through the string array and put the numbers into the int array.
			for (int i = 0; i < split.length; i++)
			{
				number[i] = Integer.parseInt(split[i]);
			}
			scores.add(number);
		}
		
		// Print out the table and determine the winner.
		for (int[] array : scores)
		{
			System.out.println();
			for (int number : array)
			{
				System.out.print(" " + number);
			}
		}
		
		// Determine the winner compared to par.
		for (int[] array : scores)
		{
			par += array[0];
		}
		for (int[] array : scores)
		{
			player1 += array[1];
		}
		player1 -= par;
		for (int[] array : scores)
		{
			player2 += array[2];
		}
		player2 -= par;
		for (int[] array : scores)
		{
			player3 += array[3];
		}
		player3 -= par;
		for (int[] array : scores)
		{
			player4 += array[4];
		}
		player4 -= par;
		System.out.println();
		System.out.println("Par: " + par);
		System.out.println("Player 1: " + player1);
		System.out.println("Player 2: " + player2);
		System.out.println("Player 3: " + player3);
		System.out.println("Player 4: " + player4);
		
		// Create an array of the players scores.
		int[] playerScoreArray = new int[4];
		playerScoreArray[0] = player1;
		playerScoreArray[1] = player2;
		playerScoreArray[2] = player3;
		playerScoreArray[3] = player4;
		
		
		for (int i = 0; i <= 3; i++)
		{
			if (playerScoreArray[i] < smallest)
			{
				smallest = playerScoreArray[i];
				winner = (i + 1);
			}
		}
		System.out.println("Winner: player" + winner);
	}
}