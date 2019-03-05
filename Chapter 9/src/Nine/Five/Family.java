package Nine.Five;

public class Family
{
	public static void main(String[] args)
	{
		// Create objects and variables.
		Dad father = new Dad("Joe", 'J', "Shmoe", 30, "American", "IT", 10000);
		Mom mother = new Mom("Cat", 'C', "Cathy", 28, "American", "Chef", 10000);
	
		// Exercise objects.
		father.doDishes();
		mother.doLaundry();
		father.fixStuff();
		
		System.out.println();
		System.out.println("Mothers First Name: " + mother.getFirstName());
		System.out.println("Fathers First Name: " + father.getFirstName());
	}
}