import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //GLOBAL STRINGS
    static final String disclaimer = " Be sure to use correct grammar and capitalization.";
    static final String correct = "Your answer is correct. Your new score is ";
    static final String incorrect = "Your answer is incorrect. The correct answer is ";

    public static void main(String[] args) {

        //Q&A Pairs
        QAPair zero = new QAPair("What is the capital of Colorado?", "Denver");
        QAPair one = new QAPair("What is the capital of Syria?", "Damascus");
        QAPair two = new QAPair("What is the derivative of 2^2?", "0");
        QAPair three = new QAPair("What is the first number in the specific heat capacity of water?", "4");
        QAPair four = new QAPair("Which case established judicial review?", "Marbury v. Madison");

        List<QAPair> qapairs = new ArrayList<>();
        qapairs.add(zero);
        qapairs.add(one);
        qapairs.add(two);
        qapairs.add(three);
        qapairs.add(four);

        //UTILITY STRINGS
        final String proceed = "Type 'quit' if you wish to quit, and anything else if you wish to proceed.";
        int off = 0;
        int score = 0;
        Scanner prompter = new Scanner(System.in);

        //GAME MECHANISM
        while(off == 0) {
            for (QAPair qapair : qapairs) {
                System.out.println(qapair.question + disclaimer);
                String input = prompter.nextLine();
                if (input.equals(qapair.answer)) {
                    score = updateScore(score);
                    System.out.println(correct + score + ".");
                } else {
                    System.out.println(incorrect + qapair.answer + ".");
                }
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println(proceed);
            String wishQuit = scanner.nextLine();
            if(wishQuit.equals("quit")) {
                off = 1;
                System.out.println("Thanks for playing! Your final score is " + score + ".");
            }
        }
    }

    public static int updateScore(int score) {
        return score + 1;
    }
}