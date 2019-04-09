package Twelve.Six;

public class Driver
{
	public static void main(String[] args)
	{
		Queens queens = new Queens();
		
		queens.queen(0, 0);
		
		System.out.println(queens);
	}
}