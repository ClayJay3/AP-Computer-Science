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

	// Recursive method that finds the locations of eight queens so that they don't 'kill' eachother when placed on the chess board.
	public boolean queen(int row, int column)
	{
		// Instance variables.
		boolean done = false;
		
		// Determines if this queens location is valid.
		if (valid(row, column))
		{
			//Increment Queen counter.
			queensPlaced ++;
			
			// Mark this cell as tried.
			chessBoard[row][column] = TRIED;
			
			// Print user info.
			System.out.println("row: " + row);
			System.out.println("column: " + column);
			System.out.println("queens placed: " + queensPlaced);
			
			// If 8 queens have been placed then the problem is solved.
			if (queensPlaced == 8)
			{
				done = true;
			}
			else
			{
				// LOGIC BLOCKS FOR MOVING QUEENS.
				// LEFT DOWN
				if (!done)
					done = queen(row + 1, column - 1);
				if (!done)
					done = queen(row + 1, column - 2);	
				if (!done)
					done = queen(row + 1, column - 3);	
				if (!done)
					done = queen(row + 1, column - 4);	
				if (!done)
					done = queen(row + 1, column - 5);	
				if (!done)
					done = queen(row + 1, column - 6);	
				if (!done)
					done = queen(row + 1, column - 7);
				// RIGHT DOWN
				if (!done)
					done = queen(row + 1, column + 1);
				if (!done)
					done = queen(row + 1, column + 2);
				if (!done)
					done = queen(row + 1, column + 3);
				if (!done)
					done = queen(row + 1, column + 4);
				if (!done)
					done = queen(row + 1, column + 5);
				if (!done)
					done = queen(row + 1, column + 6);
				if (!done)
					done = queen(row + 1, column + 7);
				// LEFT UP
				if (!done)
					done = queen(row - 1, column - 1);
				if (!done)
					done = queen(row - 1, column - 2);
				if (!done)
					done = queen(row - 1, column - 3);
				if (!done)
					done = queen(row - 1, column - 4);
				if (!done)
					done = queen(row - 1, column - 5);
				if (!done)
					done = queen(row - 1, column - 6);
				if (!done)
					done = queen(row - 1, column - 7);
				// RIGHT UP
				if (!done)
					done = queen(row - 1, column + 1);
				if (!done)
					done = queen(row - 1, column + 2);
				if (!done)
					done = queen(row - 1, column + 3);
				if (!done)
					done = queen(row - 1, column + 4);
				if (!done)
					done = queen(row - 1, column + 5);
				if (!done)
					done = queen(row - 1, column + 6);
				if (!done)
					done = queen(row - 1, column + 7);
			}
			
			// If the solution has been found place the queens and print the board.
			if (done)
			{
				chessBoard[row][column] = QUEEN;
			}
		}
		
		return done;
	}
	
	// Determine if this queens location conflicts with another.
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
			
			// Diagonally...
			for (int i = 0; i < chessBoard.length; i++)
			{
				if (chessBoard[i][i] != 0 && i != row && i != column)
				{
					isValid = false;
				}
//				if (chessBoard[i][Math.abs(i - 7)] != 0 && i != row && i != column)
//				{
//					isValid = false;
//				}
			}
		}
		else
		{
			isValid = false;
		}

		return isValid;
	}
	
	// Object toString.
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