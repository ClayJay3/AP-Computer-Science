package Twelve.Nine;

import java.util.ArrayList;

public class PascalTriangle
{
	// Method that recursively prints pacals triangle for Nth number of lines.
	public int triangle(int row, int column)
	{
		// Create instance variables.
		int result = 0;

		if (column == 0 || column == row)
		{
			result = 1;
		}
		else
		{
			// Calculate the next two numbers above this number.
			result = triangle(row - 1, column - 1) + triangle(row - 1, column);
		}
		
		return result;
	}
}