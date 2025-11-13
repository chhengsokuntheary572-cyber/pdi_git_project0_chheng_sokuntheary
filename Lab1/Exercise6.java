import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input your scores of 4 subjects (Math, English, Physics, Programming):");
            int score1 = input.nextInt();
            int score2 = input.nextInt();
            int score3 = input.nextInt();
            int score4 = input.nextInt();

            int maxScore = Math.max(Math.max(score1, score2), Math.max(score3, score4));
            int minScore = Math.min(Math.min(score1, score2), Math.min(score3, score4));
            double average = (score1 + score2 + score3 + score4) / 4.0;

            System.out.println("Maximum score is: " + maxScore);
            System.out.println("Minimum score is: " + minScore);
            System.out.println("Average score of this student is: " + average);
        }
    }
}