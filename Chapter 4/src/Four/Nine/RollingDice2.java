package Four.Nine;

public class RollingDice2
{
	public static void main(String[] args)
	{
		PairOfDice dicePair = new PairOfDice();
		
		dicePair.rollDice();
		dicePair.setSecondDiceValue(4);
		
		System.out.println("Dice1 = " + dicePair.getFirstDiceValue() + "\nDice2 = " + dicePair.getSecondDiceValue());
		System.out.println();
		System.out.println("Sum of the Dice: " + dicePair.dieSum());
	}
}