import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if(word.isEmpty()) {
                printWordList(words);
                break;
            }
            else
                System.out.println();
                words.add(word);
        }

    }

    public static void printWordList(ArrayList<String> wordList) {
        for (String word:
             wordList) {
            System.out.println(word);
        }
    }
}
