public class Calculator {

    private Reader reader = new Reader();
    private int numberOfCalculations = 0;

    public Calculator() {

    }

    private int[] getValues() {

        int[] values = new int[2];

        System.out.print("value 1: ");
        values[0] = reader.readInteger();
        System.out.print("value 2: ");
        values[1] = reader.readInteger();

        return values;
    }

    private void sum() {

        int[] values = getValues();

        int sum = values[0] + values[1];

        this.numberOfCalculations++;

        System.out.println("sum of the vaues " + sum);
    }

    private void difference() {

        int[] values = getValues();

        int difference = values[0] - values[1];

        this.numberOfCalculations++;

        System.out.println("difference of the values " + difference);
    }

    private void product() {

        int[] values = getValues();

        int product = values[0] * values[1];

        this.numberOfCalculations++;

        System.out.println("product of the values " + product);
    }

    private void statistics() {

        System.out.println("calculations done " + numberOfCalculations);
    }

    public void start() {

        while(true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            }
            else if (command.equals("difference")) {
                difference();
            }
            else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

}
