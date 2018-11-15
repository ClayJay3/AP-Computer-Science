package Five.Fourteen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindInteger
{
	public static void main(String[] args) throws IOException
	{
		// Create variables and objects
		String line = "";
		Scanner fileScan = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 5/src/Five/Fourteen/text.inp"));
		
		// Find and print the integer in the text file.
		System.out.println("-----Integer Tables-----");
		while (fileScan.hasNext())
		{
			line = fileScan.nextLine();
			
			for (Character number : line.toCharArray())
			{
				if (number.isDigit(number))
				{
					System.out.println(number);
				}
			}
		}
	}
}