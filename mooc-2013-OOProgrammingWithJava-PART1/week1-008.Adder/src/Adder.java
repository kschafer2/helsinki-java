
import java.util.Scanner;

public class Adder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user
        System.out.println("Type a number: ");
        int input1 = reader.nextInt();
        System.out.println("Type another number: ");
        int input2 = reader.nextInt();
        int sum = input1 + input2;
        System.out.println("\nSum of the numbers: " + sum);
    }
}
