package Eight.Ten;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz
{
	// Create variables, objects, and arrays.
	private ArrayList<Question> questions = new ArrayList<Question>();
	private String[] answers = new String[25];
	private Scanner userInput = new Scanner(System.in);
	
	// Object Constructor.
	public Quiz()
	{
		
	}
	
	// Present the questions in the quiz and take an answer.
	public void giveQuiz()
	{
		// Give the quiz and accept answers.
		System.out.println("Quiz:");
		for (Question question : questions)
		{
			System.out.println(question.getQuestion());
			question.setResponse(userInput.nextLine());
		}
	}
	
	// Add a question to the quiz.
	public void add(String question, String answer)
	{
		if (questions.size() == 25)
		{
			System.out.println("Test is full!");
		}
		else
		{
			questions.add(new Question(question, answer));
		}
	}
	
	// toString that prints the test results.
	public String toString()
	{
		// Create a string to return.
		String str = "";
		
		// Store results in string.
		for (Question question : questions)
		{
			str += question.toString();
		}
		
		return str;
	}
}