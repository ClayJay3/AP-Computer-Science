package Five.Thirteen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TextCompare
{
	public static void main(String[] args) throws IOException
	{
		// Create variables and objects.
		int lineCounter = 0;
		String file1Line = "";
		String file2Line = "";
		Scanner fileScan1 = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 5/src/Five/Thirteen/file1.inp"));
		Scanner fileScan2 = new Scanner(new File("/root/Documents/AP-Computer-Science/Chapter 5/src/Five/Thirteen/file2.inp"));
		
		System.out.println("----File Differences----");
		while (fileScan1.hasNext() && fileScan2.hasNext())
		{
			lineCounter ++;
			file1Line = fileScan1.nextLine();
			file2Line = fileScan2.nextLine();
			if (!file1Line.matches(file2Line))
			{
				System.out.println("File1 Line " + lineCounter + " " + file1Line);
				System.out.println("File2 Line " + lineCounter + " " + file2Line);
				System.out.println();

			}
		}
	}
}