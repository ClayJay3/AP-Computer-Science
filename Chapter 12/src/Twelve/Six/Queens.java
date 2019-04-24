package Twelve.Six;

public class Queens
{
	// Create objects, variables, and arrays.
	private final int TRIED = 1;
	private final int QUEEN = 2;
	private int queensPlaced = 0;
	private int[][] chessBoard = {{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0},
								{0,0,0,0,0,0,0,0}};

	///////////////////////////////////////////////////////
	///	Recursive method that finds the locations of 	///
	///	eight queens so that they don't 'kill' 			///
	///	eachother when placed on the chess board.		///
	///////////////////////////////////////////////////////
	public boolean queen(int row, int column)
	{
		// Instance variables.
		boolean done = false;
		
		// Print debug info.
		//System.out.println("row: " + row);
		//System.out.println("column: " + column);
		//System.out.println("queens placed: " + queensPlaced);
		
		// Determines if this queens location is valid.
		if (valid(row, column))
		{
			//Increment Queen counter.
			queensPlaced ++;
			
			// Mark this cell as tried.
			chessBoard[row][column] = TRIED;
			
			// If 8 queens have been placed then the problem is solved.
			if (queensPlaced == 8)
			{
				done = true;
			}
			else
			{
				// LOGIC BLOCKS FOR MOVING QUEENS.
				done = queen(row + 1, column + 1);
				for (int i = 1; i < chessBoard[0].length; i++) 
				{
					// Move the queen...
					if (!done)
						done = queen(row + 1, column + i);
					if (!done)
						done = queen(row + 1, column - i);
				}
				
				// If not done than back out and undo actions.
				if (!done)
					chessBoard[row][column] = 0;
					queensPlaced -= 1;
			}
			
			// If the solution has been found place the queens and print the board.
			if (done)
			{
				chessBoard[row][column] = QUEEN;
				
			}
			
			// Print debug info.
			//System.out.println("QUEEN SUCCESSFULLY PLACED!\n" + toString() + "\n\n");
		}
		
		return done;
	}
	
	///////////////////////////////////////////////////////////////////
	/// Determine if this queens location conflicts with another	///
	///////////////////////////////////////////////////////////////////
	private boolean valid(int row, int column)
	{
		boolean isValid = true;

		// Make sure values are inside the array.
		if (row >= 0 && row < chessBoard.length && column >= 0 && column < chessBoard[row].length && chessBoard[row][column] == 0)
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
			
			// Diagonally... (both ways)
			int key = row - column;
			for (int i = 0; i < chessBoard.length; i ++)
			{
				for (int j = 0; j < chessBoard[0].length; j++)
				{
					if (i - j == key && chessBoard[i][j] == 1)
					{
						isValid = false;
						
					}
				}
			}
			key = row + column;
			for (int i = 0; i < chessBoard.length; i ++)
			{
				for (int j = 0; j < chessBoard[0].length; j++)
				{
					if (i + j == key && (chessBoard[i][j] == 1 || chessBoard[i][j] == 2))
					{
						isValid = false;
						
					}
				}
			}
			
		}
		else 
		{
			isValid = false;
		}

		return isValid;
	}
	
	
	
	///////////////////////////////////////////////////////
	///				Clears the Chessboard.			    ///
	///////////////////////////////////////////////////////
	public void clear()
	{
		queensPlaced = 0;
		for (int i = 0; i < chessBoard.length; i++)
		{
			for (int j = 0; j < chessBoard[0].length; j++)
			{
				chessBoard[i][j] = 0;
			}
		}
	}
	
	///////////////////////////////////////////////////////
	///					Object toString.				///
	///////////////////////////////////////////////////////
	public String toString()
	{
		String result = "";
		
		for (int row = 0; row < chessBoard.length; row ++)
		{
			for (int column = 0; column < chessBoard[0].length; column ++)
			{
				result += chessBoard[row][column] + "";
			}
			result += "\n";
		}
		
		return result;
	}
}