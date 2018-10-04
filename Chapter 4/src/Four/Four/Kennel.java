package Four.Four;

public class Kennel
{
	public static void main(String[] args)
	{
		Dog doggo1 = new Dog(2, "Jake");
		Dog doggo2 = new Dog(9, "Circuit");
		
		doggo1.convertDogHumanAge();
		doggo2.setDogAge(10);
		
		System.out.println("Dog1 Age + Name: " + doggo1);
		System.out.println("Dog2 Age + Name: " + doggo2.getDogName() + " is " + doggo2.getDogAge() + " years old, and " + doggo2.convertDogHumanAge() +  " years old in human years.");
	}
}