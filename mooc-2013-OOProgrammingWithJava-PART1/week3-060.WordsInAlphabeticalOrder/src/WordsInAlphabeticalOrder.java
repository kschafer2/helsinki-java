
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Enter a word:");
            String word = reader.nextLine();
            if (word.isEmpty()) {
                wordsInAlphabeticalOrder(words);
                break;
            } else words.add(word);
        }
    }

    public static void wordsInAlphabeticalOrder(ArrayList<String> words) {
        Collections.sort(words);
        for (String word :
                words) {
            System.out.println(word);
        }
    }
}
