package Four.One;

public class CounterTest
{
	public static void main(String[] args)
	{
		// Create object pointers.
		Counter count1 = new Counter();
		Counter count2 = new Counter();
		
		// Tally count1 three times.
		count1.click();
		count1.click();
		count1.click();
		
		// Tally count2 two times
		count2.click();
		count2.click();
	
		// Print values.
		System.out.println("Tally 1 Count: " + count1);
		System.out.println("Tally 2 Count: " + count2);
		
		// Reset count1 to 0.
		count1.resetCount();
		System.out.println("Reset Count 1: " + count1.getCount());
	}
}
