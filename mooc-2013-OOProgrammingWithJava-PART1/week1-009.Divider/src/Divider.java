
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        // Implement your program here. Remember to ask the input from user.
        System.out.println("Type a number: ");
        double input1 = reader.nextDouble();
        System.out.println("Type another number: ");
        double input2 = reader.nextDouble();
        double quotient = input1 / input2;
        System.out.println("\nDivision: " + input1 + " / " + input2
                + " = "+ quotient);
    }
}
