package Six.Three;

public class MultipleTable
{
	public static void main(String[] args)
	{
		System.out.println("---------Multiplication Tables---------");
		System.out.println("   1 2 3 4 5 6 7 8 9 10 11 12");
		System.out.println("  ___________________________________________");
		for (int i = 1; i <= 12; i++)
		{
			System.out.print(i + " |");
			for (int j = 1; j <= 12; j++)
			{
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}
}