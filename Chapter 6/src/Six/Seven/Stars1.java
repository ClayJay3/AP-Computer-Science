package Six.Seven;

public class Stars1
{
	public static void main(String[] args)
	{
		// Create variables.
		int loopCount = 10;
		
		// Do math and print the number of stars.
		while (loopCount > 0)
		{
			for (int i = loopCount; i >= 1; i--)
			{
				System.out.print("*");
			}
			System.out.println();
			loopCount --;
		}
	}
}