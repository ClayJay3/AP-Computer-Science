package Nine.Eight;

public class Classes
{
	/////////////////////////////////////////////////////////////
	///           Main Method				  .               ///
	/////////////////////////////////////////////////////////////
	public static void main(String[] args)
	{
		// Create object and variables
		Robotics RoboticsClass = new Robotics("Robotics", 220, 1.0, "Robotics Study Hall", "STEM");
		APCompSci CompSciClass = new APCompSci("AP Computer Sci A", 211, 1.20, "Learn Java Progamming", "STEM");
		
		// Manipulate robotics object.
		RoboticsClass.setIsRobotComplete(true);
		System.out.println("Robot is finished?: " + RoboticsClass.getIsRobotComplete() + " " + RoboticsClass.getNumber());
		
		// Manipulate CompSci object.
		CompSciClass.setHadCoding(false);
		System.out.println("Computer Science Class has Coding?: " + CompSciClass.getHasCoding());
	}
}