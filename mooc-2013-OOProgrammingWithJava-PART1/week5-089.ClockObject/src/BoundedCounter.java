public class BoundedCounter {
    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value++;

        if(this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        String prefix = "";

        if(value < 10)
            prefix = "0";

        return prefix + value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int newValue) {
        if(newValue >= 0 && newValue <= this.upperLimit)
            this.value = newValue;
    }


}
