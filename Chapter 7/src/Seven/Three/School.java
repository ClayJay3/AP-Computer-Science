package Seven.Three;

public class School 
{
	public static void main(String[] args)
	{
		Address school = new Address("800 Lancaster Ave.", "Villanova", "PA", 19085);
		Address jHome = new Address("21 Jump Street", "Blacksburg", "VA", 24551);
		Student john = new Student("John", "Smith", jHome, school, 80.9);
		Address mHome = new Address("123 Main Street", "Euclid", "OH", 44132);
		Student marsha = new Student("Marsha", "Jones", mHome, school, 99, 100, 43);
		Course APCompSCI = new Course("AP Computer Science");

		// Print student info.
		System.out.println(john);
		System.out.println();
		System.out.println(marsha);
		System.out.println();
		
		// Use the course class.
		APCompSCI.addStudent(john);
		APCompSCI.addStudent(marsha);
		System.out.println("Course Average: " + APCompSCI.average());
		System.out.println("List of students in course: \n" + APCompSCI.roll());
   }
}