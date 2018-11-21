import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }

    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH)+1,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public int age() {
        int age;
        MyDate today = new MyDate(Calendar.getInstance().get(Calendar.DATE),
                Calendar.getInstance().get(Calendar.MONTH)+1,
                Calendar.getInstance().get(Calendar.YEAR));

        return birthday.differenceInYears(today);
    }
    
    public boolean olderThan(Person compared) {
        if(this.birthday.getYear() > compared.birthday.getYear())
            return false;
        if(this.birthday.getYear() == compared.birthday.getYear() && this.birthday.getMonth() > compared.birthday.getMonth())
            return false;
        if(this.birthday.getMonth() == compared.birthday.getMonth() && this.birthday.getDay() > compared.birthday.getDay())
            return false;
        return true;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
