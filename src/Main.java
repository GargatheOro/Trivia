import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //DEFINING THE DATA
        final String question1 = "What is 5+5?";
        final int answer1 = 10;
        final String question2 = "What is the square root of 121?";
        final int answer2 = 11;
        final String question3 = "What is the derivative of 2^2?";
        final int answer3 = 0;
        final String wrong = "Your answer is incorrect. The correct answer is: ";
        final String right = "Your answer is correct. Your score is: ";
        int score = 0;
        Scanner prompter = new Scanner(System.in);

        //QUESTION 1
        System.out.println(question1);
        int input1 = prompter.nextInt();
        if(input1 == answer1) {
            score++;
            System.out.println(right + score);
        } else {
            System.out.println(wrong + answer1);
        }

        //QUESTION 2
        System.out.println(question2);
        int input2 = prompter.nextInt();
        if(input2 == answer2) {
            score++;
            System.out.println(right + score);
        } else {
            System.out.println(wrong + answer2);
        }

        //QUESTION 3
        System.out.println(question3);
        int input3 = prompter.nextInt();
        if(input3 == answer3) {
            score++;
            System.out.println(right + score);
        } else {
            System.out.println(wrong + answer3);
        }

        //END OF GAME
        System.out.println("Congratulations! The game is over. You have achieved a score of " + score);
    }
}