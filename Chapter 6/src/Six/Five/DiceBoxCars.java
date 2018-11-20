package Six.Five;

public class DiceBoxCars
{
	public static void main(String[] args)
	{
		// Create variables and obejcts.
		int loopCounter = 0;
		int boxCarCounter = 0;
		PairOfDice dice = new PairOfDice();
		
		// Roll the die 100 times.
		for (int i = 1; i <= 1000; i++)
		{
			dice.rollDice();
			loopCounter ++;
			if (dice.getFirstDiceValue() == 6 && dice.getSecondDiceValue() == 6)
			{
				boxCarCounter ++;
			}
		}
		System.out.println("Box Cars Rolled: " + boxCarCounter);
		System.out.println("Number of times rolled: " + loopCounter);
	}
}