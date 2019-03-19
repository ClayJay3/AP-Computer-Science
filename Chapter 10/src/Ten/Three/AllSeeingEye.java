package Ten.Three;

public class AllSeeingEye
{
	public static void main(String[] args)
	{
		// Create speaker object.
		Speaker object;
		
		// Create others objects and make them do stuff.
		object = new President("Donald Trump", 99, "I love China!");
		System.out.println("------------[" + ((President)object).getName() + "]------------");
		object.announce("Build a wall!!");
		object.speak();
		
		object = new Intercom(false);
		System.out.println("------------[Intercom System]------------");
		object.announce("Clayton Cowen please report to Mr.Hunter's office...");
		object.speak();
		
		object = new Dog("Jake", "Chihuahua");
		System.out.println("------------[" + ((Dog)object).getName() + "(my dog)" + "]------------");
		System.out.println("Is good boy: " + ((Dog)object).getIsGoodBoy());
		object.announce("i'm a good boi");
		object.speak();
	}
}