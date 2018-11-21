import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.println("Enter a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) {
                wordsInReverseOrder(words);
                break;
            }
            else words.add(word);
        }
    }

    public static void wordsInReverseOrder(ArrayList<String> words) {
        Collections.reverse(words);
        for (String word :
                words) {
            System.out.println(word);
        }
    }
}
