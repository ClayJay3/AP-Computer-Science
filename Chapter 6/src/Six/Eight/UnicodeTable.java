package Six.Eight;

public class UnicodeTable
{
	public static void main(String[] args)
	{
		// Create variables. 
		int counter = 33;
		
		while (counter < 126)
		{
			// Loop through unicode values.
			for (int i = 0; i < 5; i++)
			{
				System.out.print(counter + " = ");
				System.out.print(Character.toChars(counter));
				System.out.print("\t");
				counter ++;
			}
			System.out.println();
		}
	}
}