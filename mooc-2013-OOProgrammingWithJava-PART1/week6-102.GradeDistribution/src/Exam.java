import java.util.ArrayList;

public class Exam {
    private ArrayList<ExamScore> scores;
    private double acceptanceRate;

    public Exam() {
        this.scores = new ArrayList<ExamScore>();
    }

    public void addScore(ExamScore score) {
        if(score.isWithinRange())
            this.scores.add(score);
    }

    public double getAcceptanceRate() {
        int successes = 0;

        for(ExamScore score : scores) {
            if(score.isAccepted())
                successes++;
        }
        this.acceptanceRate = 100*((double)successes / scores.size());
        return this.acceptanceRate;
    }

    public void print() {
        for(int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for(ExamScore score : scores) {
                if(score.grade() == i)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
