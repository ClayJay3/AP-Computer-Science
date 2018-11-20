package Six.Two;

import java.util.Scanner;

public class PrintStringByLine
{
	public static void main(String[] args)
	{
		// Create variables and objects.
		String string = "";
		Scanner userInput = new Scanner(System.in);
		
		// Take user input and print each character on a separate line.
		System.out.println("Enter a string below:");
		string = userInput.nextLine();
		
		for (Character ch : string.toCharArray())
		{
			System.out.println(ch);
		}
	}
}