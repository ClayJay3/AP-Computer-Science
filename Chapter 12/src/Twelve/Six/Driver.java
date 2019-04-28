package Twelve.Six;

public class Driver
{
	public static void main(String[] args)
	{
		Queens queens = new Queens();
		
		for (int i = 0; i < 8; i++)
		{
			// Reset the chessBoard.
			queens.queen(0, i);
			queens.clear();
		}
		System.out.println("Solutions Found: " + queens.getSolutionCount());
	}
}