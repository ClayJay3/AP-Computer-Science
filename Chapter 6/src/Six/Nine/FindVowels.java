package Six.Nine;

import java.util.Scanner;

public class FindVowels
{
	public static void main(String[] args)
	{
		// Create variables.
		int[] vowelArray = new int[5];
		int[] constantArray = new int[21];
		String userString = "";
		Scanner userInput = new Scanner(System.in);
		
		// Ask user for String.
		System.out.println("Enter a string and the program will find lowercase vowels.");
		userString = userInput.nextLine();
		
		// Detect the vowels in the string.
		for (char ch : userString.toCharArray())
		{
			switch (ch)
			{
				case 'a':
					vowelArray[0] ++;
					break;
				case 'b':
					constantArray[0] ++;
					break;
				case 'c':
					constantArray[1] ++;
					break;
				case 'd':
					constantArray[2] ++;
					break;
				case 'e':
					vowelArray[1] ++;
					break;
				case 'f':
					constantArray[3] ++;
					break;
				case 'g':
					constantArray[4] ++;
					break;
				case 'h':
					constantArray[5] ++;
					break;
				case 'i':
					vowelArray[2] ++;
					break;
				case 'j':
					constantArray[6] ++;
					break;
				case 'k':
					constantArray[7] ++;
					break;
				case 'l':
					constantArray[8] ++;
					break;
				case 'm':
					constantArray[9] ++;
					break;
				case 'n':
					constantArray[10] ++;
					break;
				case 'o':
					vowelArray[3] ++;
					break;
				case 'p':
					constantArray[11] ++;
					break;
				case 'q':
					constantArray[12] ++;
					break;
				case 'r':
					constantArray[13] ++;
					break;
				case 's':
					constantArray[14] ++;
					break;
				case 't':
					constantArray[15] ++;
					break;
				case 'u':
					vowelArray[4] ++;
					break;
				case 'v':
					constantArray[16] ++;
					break;
				case 'w':
					constantArray[17] ++;
					break;
				case 'x':
					constantArray[18] ++;
					break;
				case 'y':
					constantArray[19] ++;
					break;
				case 'z':
					constantArray[20] ++;
					break;
			}
		}
		
		// Print the stats.
		System.out.println("-------Vowels Found-------");
		System.out.println("a: " + vowelArray[0]);
		System.out.println("e: " + vowelArray[1]);
		System.out.println("i: " + vowelArray[2]);
		System.out.println("o: " + vowelArray[3]);
		System.out.println("u: " + vowelArray[4]);
		System.out.println("-------Nonvowel Characters-------");
		System.out.println("b: " + constantArray[0]);
		System.out.println("c: " + constantArray[1]);
		System.out.println("d: " + constantArray[2]);
		System.out.println("f: " + constantArray[3]);
		System.out.println("g: " + constantArray[4]);
		System.out.println("h: " + constantArray[5]);
		System.out.println("j: " + constantArray[6]);
		System.out.println("k: " + constantArray[7]);
		System.out.println("l: " + constantArray[8]);
		System.out.println("m: " + constantArray[9]);
		System.out.println("n: " + constantArray[10]);
		System.out.println("p: " + constantArray[11]);
		System.out.println("q: " + constantArray[12]);
		System.out.println("r: " + constantArray[13]);
		System.out.println("s: " + constantArray[14]);
		System.out.println("t: " + constantArray[15]);
		System.out.println("v: " + constantArray[16]);
		System.out.println("w: " + constantArray[17]);
		System.out.println("x: " + constantArray[18]);
		System.out.println("y: " + constantArray[19]);
		System.out.println("z: " + constantArray[20]);
	}
}