package Eight.Five;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class NumberCrunch
{
	public static void main(String[] args) throws IOException
	{
		// Create objects and variables.
		int fileNumber = 0;
		int length = 0;
		double total = 0;
		double mean = 0;
		double standardDeviation = 0;
		double[] calculations = new double[50];
		Scanner fileInput = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 8/src/Eight/Five/numbers.inp"));
		
		// Loop through the file and find the mean.
		while (fileInput.hasNextInt())
		{
			// Get next number from file.
			fileNumber = fileInput.nextInt();
			
			// Add the number to total and increment length.
			total += fileNumber;
			length ++;
		}
		// Calculate mean and reset fileInput.
		mean = total / length + 0.0;
		
		// Loop through the file and find the standard deviation.
		length = 0;
		Scanner fileInput2 = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 8/src/Eight/Five/numbers.inp"));
		while (fileInput2.hasNextInt())
		{
			// Get next number from file.
			fileNumber = fileInput2.nextInt();
			
			calculations[length] = Math.pow((fileNumber - mean), 2);
			
			// Increment counter.
			length ++;
		}
		// Find total of number added together.
		for (double number : calculations)
		{
			total += number;
		}
		// Final calculation.
		standardDeviation = Math.sqrt(total / length + 0.0);
		
		// Print the results.
		System.out.println("Mean: " + mean);
		System.out.println("StandardDeviation: " + standardDeviation);
	}
}