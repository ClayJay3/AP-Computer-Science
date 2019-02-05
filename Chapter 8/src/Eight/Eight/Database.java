package Eight.Eight;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Database
{
	public static void main(String[] args) throws IOException
	{
		// Create objects and variables.
		String firstName = "";
		String lastName = "";
		String zip = "";
		NamePost[] infoArray = new NamePost[25];
		Scanner fileInput = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 8/src/Eight/Eight/NamesAndZIPS.inp"));
		
		// Tell the fileInput object to separate words with a space in between.
		fileInput.useDelimiter(" ");
		
		// Loop through the file and get the person's info.
		for (int i = 0; i <= 25; i++)
		{
			for (int j = 1; j <= 3; j++)
			{
				// If the next line exists then store its info.
				if (fileInput.hasNext())
				{
					switch (j)
					{
					case 1:
						firstName = fileInput.next();
						break;
						
					case 2:
						lastName = fileInput.next();
						break;
						
					case 3:
						zip = fileInput.next();
						infoArray[i] = new NamePost(firstName, lastName, zip);
						break;
					}
				}
			}
		}
		
		// Print the infoArray.
		System.out.println("User Database:");
		for (int i = 0; i < 25; i++)
		{
			if (infoArray[i] != null)
			{
				System.out.println(infoArray[i].getName() + " " + infoArray[i].getZip());
			}
		}
	}
}