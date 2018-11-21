
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (recurringWord(words, word)) {
                System.out.println("You gave the word " + word + " twice.");
                break;
            }
        }
        
    }
    public static Boolean recurringWord(ArrayList<String> words, String word) {
        if(words.contains(word)){
            return true;
        }
        else {
            words.add(word);
            return false;
        }
    }
}
