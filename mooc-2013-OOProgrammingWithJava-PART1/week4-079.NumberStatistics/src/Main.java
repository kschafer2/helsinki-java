import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics set1 = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        int number = 0;

        System.out.println("Type numbers: ");

        number = reader.nextInt();

        while(number != -1) {
            set1.addNumber(number);

            if(number % 2 == 0)
                even.addNumber(number);
            else
                odd.addNumber(number);

            number = reader.nextInt();
        }

        System.out.println("Sum: " + set1.sum());
        System.out.println("Sum of even: " + even.sum());
        System.out.println("Sum of odd: " + odd.sum());

    }
}
