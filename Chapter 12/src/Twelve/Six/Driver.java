package Twelve.Six;

public class Driver
{
	public static void main(String[] args)
	{
		Queens queens = new Queens();
		
		if (queens.queen(0, 0))
		{
			System.out.println(queens);
			System.out.println("Solution found!!!");
		}
		else
		{
			System.out.println(queens);
			System.out.println("No solution has been found");
		}
	}
}