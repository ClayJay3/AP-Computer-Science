package Six.Seven;

public class Stars3
{
	public static void main(String[] args)
	{
		// Create variables.
		int loopCounter = 100;
		int spaceCounter = 0;
		
		// Do the math and loop through spaces and stars.
		while (loopCounter > 0)
		{
			// First, print out the spaces.
			for (int i = 0; i < spaceCounter; i++)
			{
				System.out.print(" ");
			}
			// Print out the stars.
			for (int i = 0; i <= loopCounter - 1; i ++)
			{
				System.out.print("*");
			}
			System.out.println();
			loopCounter --;
			spaceCounter ++;
		}
	}
}