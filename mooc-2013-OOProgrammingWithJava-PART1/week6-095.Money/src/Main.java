
public class Main {

    public static void main(String[] args) {
        Money starting = new Money(10,0);
        Money decrement = new Money(7,40);
        System.out.println(starting.minus(decrement));
    }
}
