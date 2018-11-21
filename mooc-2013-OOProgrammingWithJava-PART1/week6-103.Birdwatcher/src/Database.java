import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birds;

    public Database() {
        this.birds = new ArrayList<Bird>();
    }

    public void add(Bird newBird) {
        birds.add(newBird);
    }

    public void statistics() {
        for(Bird bird : birds)
            System.out.println(bird);
    }

    public void observation(String name) {
        for(Bird bird : birds) {
            if(bird.getName().contains(name)) {
                bird.newObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void show(String name) {
        for(Bird bird : birds) {
            if(bird.getName().contains(name))
                System.out.println(bird);
        }
    }
}
