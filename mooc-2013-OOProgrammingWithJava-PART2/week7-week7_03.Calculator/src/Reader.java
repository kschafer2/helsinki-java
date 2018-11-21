import java.util.Scanner;

public class Reader {

    private Scanner reader = new Scanner(System.in);

    public Reader() {

    }

    public String readString() {
        String userString = reader.nextLine();
        return userString;
    }

    public int readInteger() {
        int userInt = Integer.parseInt(reader.nextLine());
        return userInt;
    }
}
