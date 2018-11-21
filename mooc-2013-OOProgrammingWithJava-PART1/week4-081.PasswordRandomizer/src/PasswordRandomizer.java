import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int number;
        char character;
        String ans = "";

        for(int i = 0; i < length; i++) {
            character = (char)(97 + random.nextInt(26));
            String tempString = Character.toString(character);
            ans += tempString;
        }

        return ans;
    }
}
