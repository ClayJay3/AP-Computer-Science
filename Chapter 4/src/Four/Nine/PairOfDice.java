package Four.Nine;

public class PairOfDice
{
	// Create objects.
	private Die dice1 = new Die();
	private Die dice2 = new Die();
	
	// Create constructor.
	public PairOfDice()
	{
		dice1.roll();
		dice2.roll();
	}
	
	// Roll dice.
	public String rollDice()
	{
		dice1.roll();
		dice2.roll();
		return "Die1: " + dice1.getFaceValue() + "\nDie2: " + dice2.getFaceValue();
	}
	
	// Calculate die sum.
	public int dieSum()
	{
		int sum;
		
		sum = (int) (dice1.getFaceValue() + dice2.getFaceValue());
		return sum;
	}
	
	// Create setters.
	public void setFirstDiceValue(int faceValue)
	{
		dice1.setFaceValue(faceValue);
	}
	public void setSecondDiceValue(int faceValue)
	{
		dice2.setFaceValue(faceValue);
	}
	
	// Create getters.
	public int getFirstDiceValue()
	{
		return dice1.getFaceValue();
	}
	public int getSecondDiceValue()
	{
		return dice2.getFaceValue();
	}
}