
public class CashRegister {

    private double cashInRegister;
    private static final double ECONOMICAL_COST = 2.50;
    private static final double GOURMET_COST = 4.00;
    private int economicalSold;
    private int gourmetSold;


    public CashRegister() {
        this.cashInRegister = 1000.0;
    }

    public double payEconomical(double cashGiven) {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= ECONOMICAL_COST) {
            cashInRegister += ECONOMICAL_COST; //    the price of lunch is added to register
            economicalSold++; //    the amount of sold lunch is incremented by one
            return cashGiven - ECONOMICAL_COST; //    method returns cashGiven - lunch price
        }
        return cashGiven; // if not enough money given, all is returned and nothing else happens
    }

    public double payGourmet(double cashGiven) {
        if (cashGiven >= GOURMET_COST) {
            cashInRegister += GOURMET_COST;
            gourmetSold++;
            return cashGiven - GOURMET_COST;
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {
        if (card.balance() >= ECONOMICAL_COST) {
            card.pay(ECONOMICAL_COST);
            this.economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= GOURMET_COST) {
            card.pay(GOURMET_COST);
            this.gourmetSold++;
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }


    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
