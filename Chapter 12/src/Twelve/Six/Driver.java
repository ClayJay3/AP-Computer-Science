package Twelve.Six;

public class Driver
{
	public static void main(String[] args)
	{
		Queens queens = new Queens();
		
		for (int i = 0; i < 8; i++)
		{
			System.out.println("__________________________________________________");
			if (queens.queen(0, i))
			{
				System.out.println(queens);
				System.out.println("Solution found!!!");
			}
			else
			{
				System.out.println(queens);
				System.out.println("No solution has been found for queen placement: 0," + i);
			}
			
			// Reset the chessBoard.
			queens.clear();
		}
	}
}