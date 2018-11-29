package Six.Seven;

public class Stars4
{
	public static void main(String[] args)
	{
		int loopCounter = 100;
		int starCounter = 0;
		int spaceCounter = 0;
		int reverseLoopCounter = 0;
		int reverseStarCounter = 0;
		
		// Do the math and print the spaces and stars.
		while (loopCounter > 0)
		{
			// First, print out the spaces.
			if (starCounter % 2 != 0)
			{
				for (int i = 0; i < loopCounter / 2; i++)
				{
					System.out.print(" ");
				}
				for (int i = 0; i < starCounter; i++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			starCounter ++;
			loopCounter --;
			reverseLoopCounter ++;
		}
		while (reverseLoopCounter > 0)
		{
			// Print the reverse of the above code.
			if (starCounter % 2 != 0)
			{
				for (int i = 0; i < spaceCounter / 2; i++)
				{
					System.out.print(" ");
				}
				for (int i = starCounter; i > 0; i--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			starCounter --;
			spaceCounter ++;
			reverseLoopCounter --;
		}
	}
}