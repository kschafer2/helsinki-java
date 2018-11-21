
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate comparedDate) {
        int difference;
        MyDate greaterDate = null;
        MyDate lesserDate = null;

        if(this.year > comparedDate.year) {
            greaterDate = this;
            lesserDate = comparedDate;
        }

        else if(this.year < comparedDate.year) {
            greaterDate = comparedDate;
            lesserDate = this;
        }

        else return 0;

        difference = greaterDate.year - lesserDate.year;

        if(greaterDate.month < lesserDate.month ||
                (greaterDate.month == lesserDate.month && greaterDate.day < lesserDate.day))
            difference--;

        return difference;
    }
}
