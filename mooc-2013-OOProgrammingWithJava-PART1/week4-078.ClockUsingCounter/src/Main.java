
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.println("seconds: ");
        int s = reader.nextInt();
        System.out.println("minutes: ");
        int m = reader.nextInt();
        System.out.println("hours: ");
        int h = reader.nextInt();

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        for(int i = 0; i < 121; i++) {
            System.out.println(hours + ":" + minutes + ":" + seconds);

            seconds.next();

            if(seconds.getValue() == 0) {
                minutes.next();

                if(minutes.getValue() == 0)
                    hours.next();
            }
        }

    }
}
