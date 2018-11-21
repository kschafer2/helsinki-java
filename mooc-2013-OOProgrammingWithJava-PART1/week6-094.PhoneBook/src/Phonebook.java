import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> people;

    public Phonebook() {
        people = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        Person person = new Person(name, number);
        people.add(person);
    }

    public void printAll() {
        for(Person person : people)
            System.out.println(person);
    }

    public String searchNumber(String name) {
        for(Person person : people) {
            if(person.getName().equals(name))
                return person.getNumber();
        }
        return "number not known";

    }
}
