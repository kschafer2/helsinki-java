
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account first = new Account("First", 100.00);
        first.deposit(20.0);
        System.out.println(first);

    }

}
