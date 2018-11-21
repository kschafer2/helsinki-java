
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String input = reader.nextLine();
        int num = calculateCharacters(input);
        System.out.println(num);
    }
    
     //do here the method
    public static int calculateCharacters(String text) {
        int length = text.length();
        return length;
    }
    
}
