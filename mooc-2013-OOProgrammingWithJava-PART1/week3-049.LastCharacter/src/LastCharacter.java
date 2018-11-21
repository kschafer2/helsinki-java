import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your name? ");
        String name = reader.nextLine();
        System.out.println("The last letter is: " + lastCharacter(name));
    }

    public static char lastCharacter(String text) {
        char last = text.charAt(text.length()-1);
        return last;
    }
}
