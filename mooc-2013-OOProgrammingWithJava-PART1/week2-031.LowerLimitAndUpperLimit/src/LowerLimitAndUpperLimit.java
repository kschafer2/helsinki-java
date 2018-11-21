
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int first = reader.nextInt();
        System.out.println("Second: ");
        int second = reader.nextInt();
        if(first <= second) {
            while(first <= second) {
                System.out.println(first);
                first++;
            }
        }

    }
}
