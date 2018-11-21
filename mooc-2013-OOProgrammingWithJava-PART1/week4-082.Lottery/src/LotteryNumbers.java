import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        int number;
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();
        // Write the number drawing here using the method containsNumber()
        number = 1 + random.nextInt(39);

        while(this.numbers.size() < 7) {
            number = 1 + random.nextInt(39);

            if(!this.containsNumber(number))
                this.numbers.add(number);
        }


    }

    public boolean containsNumber(int number) {
        if(this.numbers.contains(number))
            return true;
        else
            return false;
    }
}
