package Five.Fifteen;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FindPunctuation
{
	public static void main(String[] args) throws IOException
	{
		// Create variables and objects.
		int[] punctuationNumberArray = new int[20];
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
				if (number.toString().matches("[.,!?@#$%^&*()\'\"/\\-]"))
				{
					System.out.println(number);
					switch (number)
					{
						case '[':
							punctuationNumberArray[0] ++;
							break;
						case '.':
							punctuationNumberArray[1] ++;
							break;
						case ',':
							punctuationNumberArray[2] ++;
							break;
						case '!':
							punctuationNumberArray[3] ++;
							break;
						case '?':
							punctuationNumberArray[4] ++;
							break;
						case '@':
							punctuationNumberArray[5] ++;
							break;
						case '#':
							punctuationNumberArray[6] ++;
							break;
						case '$':
							punctuationNumberArray[7] ++;
							break;
						case '%':
							punctuationNumberArray[8] ++;
							break;
						case '^':
							punctuationNumberArray[9] ++;
							break;
						case '&':
							punctuationNumberArray[10] ++;
							break;
						case '*':
							punctuationNumberArray[11] ++;
							break;
						case '(':
							punctuationNumberArray[12] ++;
							break;
						case ')':
							punctuationNumberArray[13] ++;
							break;
						case '\'':
							punctuationNumberArray[14] ++;
							break;
						case '\"':
							punctuationNumberArray[15] ++;
							break;
						case '\\':
							punctuationNumberArray[16] ++;
							break;
						case '/':
							punctuationNumberArray[17] ++;
							break;
						case '-':
							punctuationNumberArray[18] ++;
							break;
						case ']':
							punctuationNumberArray[19] ++;
							break;
					}
				}
			}
		}
		
		// Print out punctuation tables.
		System.out.println("----------Punctuation Tables----------");
		System.out.println("[: " + punctuationNumberArray[0] + " times");
		System.out.println(".: " + punctuationNumberArray[1] + " times");
		System.out.println(",: " + punctuationNumberArray[2] + " times");
		System.out.println("!: " + punctuationNumberArray[3] + " times");
		System.out.println("?: " + punctuationNumberArray[4] + " times");
		System.out.println("@: " + punctuationNumberArray[5] + " times");
		System.out.println("#: " + punctuationNumberArray[6] + " times");
		System.out.println("$: " + punctuationNumberArray[7] + " times");
		System.out.println("%: " + punctuationNumberArray[8] + " times");
		System.out.println("^: " + punctuationNumberArray[9] + " times");
		System.out.println("&: " + punctuationNumberArray[10] + " times");
		System.out.println("*: " + punctuationNumberArray[11] + " times");
		System.out.println("(: " + punctuationNumberArray[12] + " times");
		System.out.println("): " + punctuationNumberArray[13] + " times");
		System.out.println("': " + punctuationNumberArray[14] + " times");
		System.out.println("\": " + punctuationNumberArray[15] + " times");
		System.out.println("\\: " + punctuationNumberArray[16] + " times");
		System.out.println("/: " + punctuationNumberArray[17] + " times");
		System.out.println("-: " + punctuationNumberArray[18] + " times");
		System.out.println("]: " + punctuationNumberArray[19] + " times");
		
	}
}