package Five.Fourteen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindInteger
{
	public static void main(String[] args) throws IOException
	{
		// Create variables and objects
		int[] numberCountArray = new int[10];
		String line = "";
		Scanner fileScan = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 5/src/Five/Fourteen/text.inp"));
		
		// Find and print the integer in the text file.
		while (fileScan.hasNext())
		{
			line = fileScan.nextLine();
			
			for (Character number : line.toCharArray())
			{
				if (Character.isDigit(number))
				{
					System.out.println(number);
					switch (Character.getNumericValue(number))
					{
						case 0:
							numberCountArray[0] ++;
							break;
						case 1:
							numberCountArray[1] ++;
							break;
						case 2:
							numberCountArray[2] ++;
							break;
						case 3:
							numberCountArray[3] ++;
							break;
						case 4:
							numberCountArray[4] ++;
							break;
						case 5:
							numberCountArray[5] ++;
							break;
						case 6:
							numberCountArray[6] ++;
							break;
						case 7:
							numberCountArray[7] ++;
							break;
						case 8:
							numberCountArray[8] ++;
							break;
						case 9:
							numberCountArray[9] ++;
							break;
					}
				}
			}
		}
		
		// Print out the results
		System.out.println("----------Number Tables----------");
		System.out.println("0: " + numberCountArray[0] + " times");
		System.out.println("1: " + numberCountArray[1] + " times");
		System.out.println("2: " + numberCountArray[2] + " times");
		System.out.println("3: " + numberCountArray[3] + " times");
		System.out.println("4: " + numberCountArray[4] + " times");
		System.out.println("5: " + numberCountArray[5] + " times");
		System.out.println("6: " + numberCountArray[6] + " times");
		System.out.println("7: " + numberCountArray[7] + " times");
		System.out.println("8: " + numberCountArray[8] + " times");
		System.out.println("9: " + numberCountArray[9] + " times");
	}
}