import java.util.Scanner;

/**
   This program shows a simple quiz with one question.
*/
public class QuestionDemo
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      Question q = new FillInQuestion("The inventor of Java is _James Gosling_.");
      //q.setText("The inventor of Java is _James Gosling_.");

      System.out.println( q );
      System.out.print("Your answer: ");
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
      
      // question 2
      FillInQuestion q2 = new FillInQuestion("The IDE for APCSA is _BlueJ_.");
      //q2.setText("The IDE for APCSA is _BlueJ_.");
      
      System.out.println( q2 );
      System.out.print("Your answer: ");
      String response2 = in.nextLine();
      System.out.println(q2.checkAnswer(response2));
      
      ChoiceQuestion q3 = new ChoiceQuestion("Who founded Apple?");
      q3.addChoice("Bill Gates", false);
      q3.addChoice("Steve Jobs", true);
      
      System.out.println( q3.toString() );
      System.out.print("Your answer: ");
      String response3 = in.nextLine();
      System.out.println(q3.checkAnswer(response3));
      
      
      
   }
}

