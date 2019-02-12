package Eight.TwentySix;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hospital
{
	public static void main(String[] args) throws IOException
	{
		// Create objects and variables.
		int patientsPerWeek = 0;
		int patientsPerDay = 0;
		int patientsPerHour = 0;
		int[][][] times = new int[4][7][24];
		Scanner userInput = new Scanner(System.in);
		Scanner fileInput = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 8/src/Eight/TwentySix/times.inp"));
		
		// Read from file and store information in the array.
		while (fileInput.hasNextLine())
		{
			// Week
			for (int i = 0; i < 4; i++)
			{
				// Day
				for (int j = 0; j < 7; j++)
				{
					// Hour
					for (int p = 0; p < 24; p++)
					{
						times[i][j][p] = fileInput.nextInt();
					}
				}
			}
		}
		
		// Find the total number patients per week, day, and hour.
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				for (int p = 0; p < 24; p++)
				{
					patientsPerWeek += times[i][j][p];
				}
			}
		}
		patientsPerDay = patientsPerWeek / 28;
		patientsPerHour = patientsPerWeek / 672;
		patientsPerWeek /= 4;
		
		// Print out the analysis.
		System.out.println("Average patients per week: " + patientsPerWeek);
		System.out.println("Average patients per day: " + patientsPerDay);
		System.out.println("Average patients per hour: " + patientsPerHour);
	}
}