package Five.Three;

import java.util.Scanner;

public class NumberProperties
{
	public static void main(String[] args)
	{
		// Create variables and objects.
		int oddCount = 0;
		int evenCount = 0;
		int zeroCount = 0;
		String number = "0";
		Scanner userInput = new Scanner(System.in);
		
		// Take an integer from the user.
		System.out.println("Enter a integer below:");
		number = userInput.nextLine();
		
		// Loop through the string index and find odd, evens, and zeros.
		for (char x : number.toCharArray())
		{
			if ((x % 2 == 0) && (x != '0'))
			{
				evenCount ++;
			}
			else
			{
				if (x == '0')
				{
					zeroCount ++;
				}
				else
				{
					oddCount ++;
				}
			}
		}
		
		// Print out looped over odd, even, and zero numbers.
		System.out.println("Number of even digits: " + evenCount);
		System.out.println("Number of odd digits: " + oddCount);
		System.out.println("Number of zero digits: " + zeroCount);
	}
}