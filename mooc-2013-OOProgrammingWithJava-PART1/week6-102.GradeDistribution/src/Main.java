import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Exam exam = new Exam();

        System.out.println("Type exam scores, -1 completes: ");

        while (true) {
            int score = reader.nextInt();

            if(score == -1) {
                System.out.println();
                break;
            }

            ExamScore nextExamScore = new ExamScore(score);
            exam.addScore(nextExamScore);
        }

        System.out.println("Grade distribution: ");
        exam.print();

        System.out.println("Acceptance percentage: " +
                exam.getAcceptanceRate());
    }
}
