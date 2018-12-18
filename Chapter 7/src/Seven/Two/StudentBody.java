package Seven.Two;

public class StudentBody 
{
	public static void main(String[] args)
	{
		Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
		Address jHome = new Address("21 Jump Street", "Blacksburg", "VA", 24551);
		Student john = new Student("John", "Smith", jHome, school, 80.9);
		Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
		Student marsha = new Student("Marsha", "Jones", mHome, school, 99, 100, 43);

		System.out.println(john);
		System.out.println();
		System.out.println(marsha);
		System.out.println("Marsha Average: " + marsha.average());
		john.setTestScore(3, 78);
		System.out.println("" + john.getTestScore(3));
   }
}