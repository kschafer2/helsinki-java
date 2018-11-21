import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = reader.nextLine();
        System.out.println("Length of end part: ");
        int length = reader.nextInt();
        System.out.println("Result: " + theEndPart(word,length));
    }

    public static String theEndPart(String word, int length) {
        String ans;
        ans = word.substring(word.length()-length,word.length());
        return ans;
    }
}
