
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Number: ");
        int num = reader.nextInt();
        int count = 0;
        int sum = 0;
        while (count <= num) {
            sum += count;
            System.out.println(sum);
            count++;

        }
    }
}
