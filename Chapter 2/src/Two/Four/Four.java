package Two.Four;

import java.util.Scanner;

public class Four
{
	public static void main(String[] args)
	{
		String name = "";
		String age = "";
		String college = "";
		String petname = "";
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type your name.");
		name = input.nextLine();
		System.out.println("Type your age.");
		age = input.nextLine();
		System.out.println("Type the name of your college.");
		college = input.nextLine();
		System.out.println("Type your pet's name.");
		petname = input.nextLine();
		
		System.out.println("Hello, my name is " + name + " and I am " + age + " years\nold. I'm enjoying my time at " + college + ", though\nI miss my pet "+ petname + " very much!");		

	}
}