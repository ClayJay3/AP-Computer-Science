package Twelve.Four;

//********************************************************************
//Maze.java       Author: Lewis/Loftus
//
//Represents a maze of characters. The goal is to get from the
//top left corner to the bottom right, following a path of 1s.
//********************************************************************

public class Maze
{
	private final int TRIED = 3;
	private final int PATH = 7;
	
	private int[][][] grid = { { {1,1,1,0,1,1,1,1,1,0,0,0,0},
	                         	 {0,0,1,0,1,0,0,0,1,0,0,0,0},
	                             {0,0,1,0,1,1,1,0,1,0,0,0,0},
	                             {0,0,1,0,0,0,1,0,1,0,0,0,0},
	                             {0,0,1,1,1,1,1,0,0,0,0,0,0},
	                             {0,0,0,0,0,0,0,0,0,0,0,0,0},
	                             {0,0,0,0,0,0,0,0,0,0,0,0,0},
	                             {0,0,0,0,0,0,0,0,0,0,0,0,0} },
			
							   { {1,0,0,0,0,0,0,0,0,0,0,0,0},
	                             {0,0,0,0,0,0,0,0,0,0,0,0,0},
		                         {0,0,0,0,0,0,0,0,0,0,0,0,0},
		                         {0,0,0,0,0,0,0,0,1,0,0,0,0},
		                         {0,0,0,0,0,0,0,0,0,0,0,0,0},
		                         {0,0,0,0,0,0,0,0,0,0,0,0,0},
		                         {0,0,0,0,0,0,0,0,0,0,0,0,0},
		                         {0,0,0,0,0,0,0,0,0,0,0,0,0} },
							   
							   { {1,0,0,0,0,0,0,0,0,0,0,0,0},
		                         {1,0,0,0,0,0,0,0,0,0,0,0,0},
			                     {1,0,0,0,0,0,0,0,0,0,0,0,0},
			                     {1,0,0,0,0,0,0,0,1,0,0,0,0},
			                     {1,0,0,0,0,0,0,0,0,0,0,0,1},
			                     {1,0,0,0,0,0,0,0,0,0,0,0,1},
			                     {1,0,0,0,0,0,0,0,0,0,0,0,1},
			                     {1,0,0,0,0,1,0,0,0,0,0,0,1} },
							   
							   { {1,0,0,0,0,0,0,0,0,0,0,0,0},
			                     {1,1,1,1,0,0,0,0,0,0,0,0,0},
				                 {0,0,0,0,0,0,0,0,0,0,0,0,0},
				                 {1,0,0,0,0,0,0,0,1,0,0,0,0},
				                 {1,1,1,0,0,0,0,0,1,1,1,1,1},
				                 {0,0,1,0,0,0,0,0,0,0,0,0,0},
				                 {1,0,1,0,0,0,0,0,0,0,0,0,0},
				                 {1,1,1,1,1,1,1,1,1,1,1,1,1} }
																};
	
//							{ { {1,1,1,0,1,1,0,0,0,1,1,1,1},
//						    	 {0,0,1,1,1,0,1,1,1,1,0,0,1},
//						        {0,0,0,0,1,0,1,0,1,0,1,0,0},
//						        {1,1,1,0,1,1,1,0,1,0,1,1,1},
//						        {1,0,1,0,0,0,0,1,1,1,0,0,1},
//						        {1,0,1,1,1,1,1,1,0,1,1,1,1},
//						        {1,0,0,0,0,0,0,0,0,0,0,0,0},
//						        {1,1,1,1,1,1,1,1,1,1,1,1,1} },
//						
//							   { {1,1,1,0,1,1,0,0,0,1,1,1,1},
//						        {1,0,1,1,1,0,1,1,1,1,0,0,1},
//						        {0,0,0,0,1,0,1,0,1,0,1,0,0},
//						        {1,1,1,0,1,1,1,0,1,0,1,1,1},
//						        {1,0,1,0,0,0,0,1,1,1,0,0,1},
//						        {1,0,1,1,1,1,1,1,0,1,1,1,1},
//						        {1,0,0,0,0,0,0,0,0,0,0,0,0},
//						        {1,1,1,1,1,1,1,1,1,1,1,1,1} },
//							   
//							   { {1,1,1,0,1,1,0,0,0,1,1,1,1},
//						        {1,0,1,1,1,0,1,1,1,1,0,0,1},
//						        {0,0,0,0,1,0,1,0,1,0,1,0,0},
//						        {1,1,1,0,1,1,1,0,1,0,1,1,1},
//						        {1,0,1,0,0,0,0,1,1,1,0,0,1},
//						        {1,0,1,1,1,1,1,1,0,1,1,1,1},
//						        {1,0,0,0,0,0,0,0,0,0,0,0,0},
//						        {1,1,1,1,1,1,1,1,1,1,1,1,1} }
//																};

	//-----------------------------------------------------------------
	//  Attempts to recursively traverse the maze. Inserts special
	//  characters indicating locations that have been tried and that
	//  eventually become part of the solution.
	//-----------------------------------------------------------------
	public boolean traverse(int row, int column, int depth)
	{
		boolean done = false;
		
		if (valid(row, column, depth))
		{
			grid[depth][row][column] = TRIED;  // this cell has been tried
	
			if (row == grid[0].length-1 && column == grid[0][0].length-1 && depth == grid.length-1)
				done = true;  // the maze is solved
			else
			{
				done = traverse(row+1, column, depth);     // down
				if (!done)
					done = traverse(row, column+1, depth);  // right
				if (!done)
					done = traverse(row-1, column, depth);  // up
				if (!done)
					done = traverse(row, column-1, depth);  // left
				if (!done)
					done = traverse(row, column, depth + 1); // forward
				if (!done)
					done = traverse(row, column, depth - 1); // backward
	     	}
	
	     	if (done) // this location is part of the final path
	     	{
	     		grid[depth][row][column] = PATH;
	     		System.out.println(toString());
	     	}
	  	}
		
	  	return done;
	}
	
	//-----------------------------------------------------------------
	//  Determines if a specific location is valid.
	//-----------------------------------------------------------------
	private boolean valid(int row, int column, int depth)
	{
		boolean result = false;
	
	  	// check if cell is in the bounds of the matrix
	  	if (row >= 0 && row < grid[0].length && column >= 0 && column < grid[0][0].length && depth >= 0 && depth < grid.length)
	  		//  check if cell is not blocked and not previously tried
	  		if (grid[depth][row][column] == 1)
	  			result = true;
	
	  	return result;
	}
	
	//-----------------------------------------------------------------
	//  Returns the maze as a string.
	//-----------------------------------------------------------------
	public String toString()
	{
		String result = "\n";
	
		// Formatting.
		System.out.println("________________________________________________________");
		
		for (int depth = 0; depth < grid.length; depth ++)
		{
			for (int row=0; row < grid[0].length; row++)
			{
				for (int column=0; column < grid[0][0].length; column++)
				{
					result += grid[depth][row][column] + "";
				}
				result += "\n";
			}
			result += "\n";
		}
	
		// Formatting.
		System.out.println("________________________________________________________");
		
		return result;
	}
}