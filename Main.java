import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Question[] quiz = new Question[3];

    quiz[0] = new Question("What's wrong with the creator of this program?");
    quiz[0].setAnswer("mental illness");

    ChoiceQuestion question = new ChoiceQuestion("Is it OK to be happy during corona?");
    question.addChoice("no", false);
    question.addChoice("yes", true);

    quiz[1] = question;
    NumericQuestion questionButNumbers = new NumericQuestion("What's 9+10?");
    questionButNumbers.setAnswer(21);
    quiz[2] = questionButNumbers;
    Scanner in = new Scanner(System.in);
    double totalQuestions = 3;
    double qCorrect = 0;

    for (Question q : quiz) {
      q.display();
      System.out.print("Your answer: ");
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
      if (q.checkAnswer(response) == true) {
        qCorrect++;
      } else {

      }
    }

    System.out.println("You got " + qCorrect + " out of " + totalQuestions + " correct. That's "
        + (qCorrect / totalQuestions)*100 + " correct.");
  }
}
