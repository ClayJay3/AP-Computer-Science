package Eight.Eleven;

public class QuizTime
{
	public static void main(String[] args)
	{
		// Create variables and objects.
		Quiz test1 = new Quiz();
		
		// Add questions to the quiz.
		test1.add("What is 2 + 2?", "4", 2);
		test1.add("How many points are on a triangle?", "3", 200);
				
		// Give the test. (Oh, darn!)
		test1.giveQuiz(0, 10);
		
		// Print the results of the test.
		System.out.println(test1);
	}
}