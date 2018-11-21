import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What's your name? ");
        String input = reader.nextLine();
        System.out.println("The first letter is: " + firstCharacter(input));
    }


    public static char firstCharacter(String name) {
        char ans = name.charAt(0);
        return ans;
    }
}