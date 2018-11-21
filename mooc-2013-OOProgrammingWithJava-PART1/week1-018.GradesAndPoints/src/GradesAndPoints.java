
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int grade = reader.nextInt();
        if(grade <= 29) {
            grade = 0;
        }
        else if(grade >= 30 && grade <= 34) {
            grade = 1;
        }
        else if(grade >= 35 && grade <= 39) {
            grade = 2;
        }
        else if(grade >= 40 && grade <= 44) {
            grade = 3;
        }
        else if(grade >= 45 && grade <= 49) {
            grade = 4;
        }
        else if(grade >= 50 && grade <= 60) {
            grade = 5;
        }

        if(grade == 0) {
            System.out.println("Grade: failed");
        }
        else {
            System.out.println("Grade: " + grade);
        }
    }
}
