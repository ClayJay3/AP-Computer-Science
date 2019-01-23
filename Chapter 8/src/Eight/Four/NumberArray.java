package Eight.Four;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class NumberArray
{
	public static void main(String[] args) throws IOException
	{
		// Create objects, variables, and arrays.
		int temp = 0;
		int counter = 0;
		int[] numberTally = new int[101];
		boolean keepScanning = true;
		Scanner fileInput = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 8/src/Eight/Four/numbers.inp"));
		
		// Find numbers and occurrences.
		while (fileInput.hasNextLine() && keepScanning)
		{
			temp = fileInput.nextInt();
			if (temp <= 100 && temp >= 1)
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
		System.out.print("1 - 10   | ");
		for (int i = 0; i <= 10; i++)
		{
			if (numberTally[i] >= 1)
			{
				for (int j = 1; j <= numberTally[i]; j++)
				{
					counter ++;
				}
			}
		}
		for (int i = 1; i <= (counter / 5.0); i++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("11 - 20  | ");
		counter = 0;
		for (int i = 11; i <= 20; i++)
		{
			if (numberTally[i] >= 1)
			{
				for (int j = 1; j <= numberTally[i]; j++)
				{
					counter ++;
				}			
			}
		}
		for (int i = 1; i <= (counter / 5.0); i++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("21 - 30  | ");
		counter = 0;
		for (int i = 21; i <= 30; i++)
		{
			if (numberTally[i] >= 1)
			{
				for (int j = 1; j <= numberTally[i]; j++)
				{
					counter ++;
				}
			}
		}
		System.out.println();
		System.out.print("31 - 40  | ");
		counter = 0;
		for (int i = 31; i <= 40; i++)
		{
			if (numberTally[i] >= 1)
			{
				for (int j = 1; j <= numberTally[i]; j++)
				{
					counter ++;
				}
			}
		}
		for (int i = 1; i <= (counter / 5.0); i++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("41 - 50  | ");
		counter = 0;
		for (int i = 41; i <= 50; i++)
		{
			if (numberTally[i] >= 1)
			{
				for (int j = 1; j <= numberTally[i]; j++)
				{
					counter ++;
				}
			}
		}
		for (int i = 1; i <= (counter / 5.0); i++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("51 - 60  | ");
		counter = 0;
		for (int i = 51; i <= 60; i++)
		{
			if (numberTally[i] >= 1)
			{
				for (int j = 1; j <= numberTally[i]; j++)
				{
					counter ++;
				}
			}
		}
		for (int i = 1; i <= (counter / 5.0); i++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("61 - 70  | ");
		counter = 0;
		for (int i = 61; i <= 70; i++)
		{
			if (numberTally[i] >= 1)
			{
				for (int j = 1; j <= numberTally[i]; j++)
				{
					counter ++;
				}
			}
		}
		for (int i = 1; i <= (counter / 5.0); i++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("71 - 80  | ");
		counter = 0;
		for (int i = 71; i <= 80; i++)
		{
			if (numberTally[i] >= 1)
			{
				for (int j = 1; j <= numberTally[i]; j++)
				{
					counter ++;
				}
			}
		}
		for (int i = 1; i <= (counter / 5.0); i++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("81 - 90  | ");
		counter = 0;
		for (int i = 81; i <= 90; i++)
		{
			if (numberTally[i] >= 1)
			{
				for (int j = 1; j <= numberTally[i]; j++)
				{
					counter ++;
				}
			}
		}
		for (int i = 1; i <= (counter / 5.0); i++)
		{
			System.out.print("*");
		}
		System.out.println();
		System.out.print("91 - 100 | ");
		counter = 0;
		for (int i = 91; i <= 100; i++)
		{
			if (numberTally[i] >= 1)
			{
				for (int j = 1; j <= numberTally[i]; j++)
				{
					counter ++;
				}
			}
		}
		for (int i = 1; i <= (counter / 5.0); i++)
		{
			System.out.print("*");
		}
	}
}