
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type the radius: ");
        double radius = reader.nextDouble();
        System.out.println("Circumfrence of the circle: " +
                (2 * Math.PI * radius));
    }
}
