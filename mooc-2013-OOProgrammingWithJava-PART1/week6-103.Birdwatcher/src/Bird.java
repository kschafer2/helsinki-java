public class Bird {
    private String name;
    private String scientificName;
    private int observations;

    public Bird(String name, String scientificName) {
        this.name = name;
        this.scientificName = scientificName;
        observations = 0;
    }

    public String getName() {
        return name;
    }

    public void newObservation() {
        observations++;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.scientificName + "): " +
                observations + " observations";
    }
}
