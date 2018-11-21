public class Reformatory {
    private int totalWeights;

    public int weight(Person person) {
        totalWeights++;
        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }

    public int totalWeightsMeasured() {
        return totalWeights;
    }
}
