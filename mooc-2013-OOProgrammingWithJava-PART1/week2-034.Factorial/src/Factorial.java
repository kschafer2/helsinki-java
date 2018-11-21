import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("NUmber: ");
        int num = reader.nextInt();
        int i = 1;
        int fact = 1;
        while(i <= num) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial is: " + fact);
    }
}
