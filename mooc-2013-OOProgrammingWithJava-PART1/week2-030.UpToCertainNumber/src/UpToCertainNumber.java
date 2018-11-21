
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        int num = 1;
        System.out.println("Up to?: ");
        int input = reader.nextInt();
        while(num <=input) {
            System.out.println(num);
            num++;
        }

        
    }
}
