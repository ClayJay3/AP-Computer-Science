package Seven.Three;

public class Student
{
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	private double[] testScores = new double[3];

	public Student(String first, String last, Address home, Address school, double testScore1, double testScore2, double testScore3)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		testScores[0] = testScore1;
		testScores[1] = testScore2;
		testScores[2] = testScore3;
	}
	
	public Student(String first, String last, Address home, Address school, double testScore1, double testScore2)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		testScores[0] = testScore1;
		testScores[1] = testScore2;
		testScores[2] = 0;
	}
	
	public Student(String first, String last, Address home, Address school, double testScore1)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		testScores[0] = testScore1;
		testScores[1] = 0;
		testScores[2] = 0;
	}
	
	public Student(String first, String last, Address home, Address school)
	{
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		testScores[0] = 0;
		testScores[1] = 0;
		testScores[2] = 0;
	}
	
	public void setTestScore(int testNumber, double testScore)
	{
		testScores[testNumber - 1] = testScore;
	}
	
	public double getTestScore(int testNumber)
	{
		return testScores[testNumber - 1];
	}
	
	public String getStudentName()
	{
		return firstName + " " + lastName;
	}
	
	public double average()
	{
		return (testScores[0] + testScores[1] + testScores[2]) / 3;
	}

	public String toString()
	{
		String result;

		result = firstName + " " + lastName + "\n";
		result += "Home Address:\n" + homeAddress + "\n";
		result += "School Address:\n" + schoolAddress + "\n";
		result += "---Test Scores---\n1:" + testScores[0] + "\n2:" + testScores[1] + "\n3:" + testScores[2] + "\nAverage:" + average();

		return result;
	}
}