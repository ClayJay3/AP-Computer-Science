package Eight.Eleven;

public class Question
{
   private String question, answer, response;
   private int complexityLevel;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the question with a default complexity.
   //-----------------------------------------------------------------
   public Question(String query, String result, int complexity)
   {
      question = query;
      answer = result;
      complexityLevel = complexity;
   }

   //-----------------------------------------------------------------
   //  Sets the complexity level for this question.
   //-----------------------------------------------------------------
   public void setComplexity(int level)
   {
      complexityLevel = level;
   }
   
   //-----------------------------------------------------------------
   //  Sets the response for this question.
   //-----------------------------------------------------------------
   public void setResponse(String response)
   {
	   this.response = response;
   }
   
   //-----------------------------------------------------------------
   //  Returns the complexity level for this question.
   //-----------------------------------------------------------------
   public int getComplexity()
   {
      return complexityLevel;
   }

   //-----------------------------------------------------------------
   //  Returns the question.
   //-----------------------------------------------------------------
   public String getQuestion()
   {
      return question;
   }

   //-----------------------------------------------------------------
   //  Returns the answer to this question.
   //-----------------------------------------------------------------
   public String getAnswer()
   {
      return answer;
   }
   
   //-----------------------------------------------------------------
   //  Returns the response to this question.
   //-----------------------------------------------------------------
   public String getResponse()
   {
	   return response;
   }
   
   //-----------------------------------------------------------------
   //  Returns true if the candidate answer matches the answer.
   //-----------------------------------------------------------------
   public boolean answerCorrect(String candidateAnswer)
   {
      return answer.equals(candidateAnswer);
   }

   //-----------------------------------------------------------------
   //  Returns this question (and its answer) as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return "\n" + question + " Answer:" + answer + "\n" + "You answered: " + response + "\n";
   }
}