
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money added) {
        int euros = this.euros + added.euros;
        int cents = this.cents + added.cents;
        Money remaining;
        Money sum = new Money(euros, cents);
        return sum;
    }

    public Money minus(Money decremented) {
        int euros = this.euros - decremented.euros;
        int cents = this.cents - decremented.cents;

        if(cents < 0) {
            euros--;
            cents = 100 + cents;
        }

        if(euros < 0) {
            euros = 0;
            cents = 0;
        }

        Money remaining = new Money(euros, cents);

        return remaining;
    }

    public boolean less(Money compared) {
        if(this.euros < compared.euros)
            return true;
        if(this.euros == compared.euros && this.cents < compared.cents)
            return true;
        return false;
    }



}
