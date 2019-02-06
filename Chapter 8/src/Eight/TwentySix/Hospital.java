package Eight.TwentySix;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Hospital
{
	public static void main(String[] args) throws IOException
	{
		// Create objects and variables.
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
		
		// Print the times array for testing.
		System.out.println(times[2][2][2]);
	}
}