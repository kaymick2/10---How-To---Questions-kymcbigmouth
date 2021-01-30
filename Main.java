import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Question[] quiz = new Question[3];

    quiz[0] = new Question("What's wrong with the creator of this program?");
    quiz[0].setAnswer("mental illness");

   quiz[1]=new ChoiceQuestion("Is it OK to be happy during corona?");
    quiz[1].addChoice("no", false);
    quiz[1].addChoice("yes", true);

    quiz[2] = question;
    NumericQuestion questionButNumbers = new NumericQuestion("What's 9+10?");
    questionButNumbers.setAnswer(21);
    Scanner in = new Scanner(System.in);
    for (Question q : quiz) {
      q.display();
      System.out.print("Your answer: ");
      String response = in.nextLine();
      System.out.println(q.checkAnswer(response));
    }
  }
}
/*   double totalQuestions=3;
    double qCorrect=0;
    if(qBuzz.checkAnswer(response)==true){
      qCorrect++;
    }else{

    }
    System.out.println("You got "+qCorrect+" out of "+totalQuestions+" correct. That's "+qCorrect/totalQuestions+" correct.");
  }
  */