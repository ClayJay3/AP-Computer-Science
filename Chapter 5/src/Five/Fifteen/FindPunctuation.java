package Five.Fifteen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindPunctuation
{
	public static void main(String[] args) throws IOException
	{
		// Create variables and objects.
		String line = "";
		Scanner fileScan = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 5/src/Five/Fifteen/text.inp"));
		
		// Find all the punctuation marks.
		System.out.println("-----Punctuation Tables-----");
		while (fileScan.hasNext())
		{
			line = fileScan.nextLine();
			
			for (Character number : line.toCharArray())
			{
				number.toString();
				if (number.toString().matches("[.,!?@#$%^&*()'\"\\-]"))
				{
					System.out.println(number);
				}
			}
		}
	}
}