package Twelve.Six;

public class Queens
{
	// Create objects, variables, and arrays.
	private int tried = 1;
	private int queen = 8;
	private int[][] chessBoard = {{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0}};

	// Recursive method that finds the locations of eight queens so that they don't 'kill' eachother when placed on the chess board.
	public boolean queen(int row, int column)
	{
		// Instance variables.
		boolean done = false;
		
		// Determines if this queens location is valid.
		if (valid(row, column))
		{
			
		}
		
		return done;
	}
	
	// Determine if this queens location conflicts with another.
	private boolean valid(int row, int column)
	{
		boolean isValid = true;

		// Make sure values are inside the array.
		if (row >= 0 && row < chessBoard.length && column >= 0 && column < chessBoard[row].length)
		{
			///////////////////////////////////////////////////
			// Find conflicting locations of other queens.	 //
			///////////////////////////////////////////////////
			
			// Sideways...
			for (int i = 0; i < chessBoard[row].length; i++)
			{
				if (chessBoard[row][i] != 0 && i != column)
				{
					isValid = false;
				}
			}
			
			// Up and Down...
			for (int i = 0; i < chessBoard.length; i++)
			{
				if (chessBoard[i][column] != 0 && i != row)
				{
					isValid = false;
				}
			}
			
			// Diagonally...
			for (int i = 0; i < chessBoard.length; i++)
			{
				
			}
		}

		return isValid;
	}
}