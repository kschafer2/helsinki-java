import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Database database = new Database();
        Bird bird;
        String command = "";
        String name;
        String scientificName;


        while (!command.equals("Quit")) {
            System.out.print("? ");
            command = reader.nextLine();

            if (command.equals("Add")) {

                System.out.print("Name: ");
                name = reader.nextLine();

                System.out.print("Latin Name: ");
                scientificName = reader.nextLine();

                bird = new Bird(name, scientificName);
                database.add(bird);
            }

            if(command.equals("Observation")) {

                System.out.print("What was observed?: ");
                name = reader.nextLine();

                database.observation(name);
            }

            if(command.equals("Statistics"))
                database.statistics();

            if(command.equals("Show")) {

                System.out.print("What? ");
                name = reader.nextLine();

                database.show(name);
            }
        }
    }
}
