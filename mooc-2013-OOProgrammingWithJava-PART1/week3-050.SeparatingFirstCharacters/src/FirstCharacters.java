import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What's your name? ");
        String input = reader.nextLine();
        returnThree(input);

    }

    public static void returnThree(String name){
        char first, second, third;
        if(name.length() >= 3) {
            first = name.charAt(0);
            second = name.charAt(1);
            third = name.charAt(2);
            System.out.println("1. Character: " + first);
            System.out.println("2. Character: " + second);
            System.out.println("3. Character: " + third);
        }

    }
}
