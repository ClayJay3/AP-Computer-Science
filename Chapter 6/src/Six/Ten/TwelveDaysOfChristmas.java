package Six.Ten;

public class TwelveDaysOfChristmas
{
	public static void main(String[] args)
	{
		// Create variables.
		int counter = 1;
		
		// Loop through and print verses.
		while (counter <= 12)
		{
			System.out.println("On the " + counter + (counter == 1 ? "st" : counter == 2 ? "nd" : counter == 3 ? "rd" : "th") + " day of Christmas my true love gave to me");
			for (int i = counter; i > 0; i--)
			{
				switch (i)
				{
					case 1:
						System.out.println("A partridge in a pair tree.");
						break;
					case 2:
						System.out.println("Two turtle doves, and");
						break;
					case 3:
						System.out.println("Three french hens");
						break;
					case 4:
						System.out.println("Four calling birds");
						break;
					case 5:
						System.out.println("Five golden rings");
						break;
					case 6:
						System.out.println("Six geese a laying");
						break;
					case 7:
						System.out.println("Seven swans a swimming");
						break;
					case 8:
						System.out.println("Eight maids a milking");
						break;
					case 9:
						System.out.println("Nine ladies dancing");
						break;
					case 10:
						System.out.println("Ten lords a leaping");
						break;
					case 11:
						System.out.println("Eleven pipers piping");
						break;
					case 12:
						System.out.println("Twelve drummers drumming");
				}
			}
			System.out.println();
			counter ++;
		}
	}
}