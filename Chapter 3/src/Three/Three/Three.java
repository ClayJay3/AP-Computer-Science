package Three.Three;

import java.util.Random;

public class Three
{
	public static void main(String[] args)
	{
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int sectionTwo = 0;
		int sectionThree = 0;
		Random rand = new Random();
		
		// First Section
		number1 = rand.nextInt(7) + 1;
		number2 = rand.nextInt(7) + 1;
		number3 = rand.nextInt(7) + 1;
				
		// Second section
		sectionTwo = rand.nextInt(556) + 100;
		
		// Third section
		sectionThree = rand.nextInt(9000) + 1000;

		// Print phone number
		System.out.println("Phone Number: " + number1 + number2 + number3 + "-" + sectionTwo + "-" + sectionThree);
	}
}