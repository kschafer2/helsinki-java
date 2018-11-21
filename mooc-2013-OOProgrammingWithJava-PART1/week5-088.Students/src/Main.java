
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();
        String name, studentNumber, input;

        while(true) {
            System.out.print("name: ");
            input = reader.nextLine();
            name = input;

            if (name.isEmpty())
                break;

            System.out.print("student number: ");
            input = reader.nextLine();
            studentNumber = input;

            students.add(new Student(name, studentNumber));
        }

        System.out.println();

        for(Student student : students)
            System.out.println(student);

        System.out.print("\nGive search term: ");
        input = reader.nextLine();
        System.out.println("Result:");

        for(Student student : students)
            if(student.getName().contains(input))
                System.out.println(student);

    }
}
