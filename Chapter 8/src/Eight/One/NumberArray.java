package Eight.One;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NumberArray
{
	public static void main(String[] args) throws IOException
	{
		// Create objects, variables, and arrays.
		int temp = 0;
		int[] numberTally = new int[51];
		boolean keepScanning = true;
		Scanner fileInput = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 8/src/Eight/One/numbers.inp"));
		
		// Find numbers and occurrences.
		while (fileInput.hasNextLine() && keepScanning)
		{
			temp = fileInput.nextInt();
			if (temp <= 50 && temp >= 0)
			{
				numberTally[temp] ++;
			}
			else
			{
				System.out.println("Number out of range! Program will continue to print found numbers...");
				keepScanning = false;
			}
		}
		
		// Print the numbers.
		for (int i = 0; i <= 50; i++)
		{
			if (numberTally[i] >= 1)
			{
				System.out.println(i + " occurred " + numberTally[i] + " times");
			}
		}
	}
}