package Two.Two;

import java.util.Scanner;
import java.math.*;

public class Two
{
	public static void main(String[] args)
	{
		// Create Variables
		int int1 = 0;
		int int2 = 0;
		int int3 = 0;
		
		// Create Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type first int.");
		int1 = input.nextInt();
		System.out.println("Type second int.");
		int2 = input.nextInt();
		System.out.println("Type third int.");
		int3 = input.nextInt();
		
		double total = (int1 + int2 + int3) / 3.0;
		
		System.out.println();
		System.out.println(total);
		
	}
}