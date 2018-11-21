
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Number: ");
        int num = reader.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= num) {
            sum += Math.pow(2,i);
            i++;
        }
        System.out.println("Result: " +sum);
    }
}
