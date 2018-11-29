package Six.Seven;

public class Stars2
{
	public static void main(String[] args)
	{
		// Create variables.
		int loopCount = 100;
		int starCounter = 1;
				
		// Do math and print the number of stars.
		while (loopCount > 0)
		{
			// Print the spaces first.
			for (int i = loopCount - 1; i >= 1; i--)
			{
				System.out.print(" ");
			}
			// Print the stars.
			for (int i = 0; i < starCounter; i++)
			{
				System.out.print("*");
			}
			System.out.println();
			loopCount --;
			starCounter ++;
		}
	}
}