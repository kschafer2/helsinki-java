
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = reader.nextLine();
        characters(name);
    }

    public static void characters(String name) {
        char nextChar;
        for (int i = 0; i < name.length(); i++) {
            System.out.println(i+1 + "." +
                    " character: " + name.charAt(i));
        }
    }
}
