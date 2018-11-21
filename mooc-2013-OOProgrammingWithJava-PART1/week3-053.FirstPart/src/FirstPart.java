
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = reader.nextLine();
        System.out.println("Length of first part: ");
        int length = reader. nextInt();
        System.out.println("Result: " + firstPart(word, length));

    }

    public static String firstPart(String word, int length) {
        String ans;
        ans = word.substring(0, length);
        return ans;
    }
}
