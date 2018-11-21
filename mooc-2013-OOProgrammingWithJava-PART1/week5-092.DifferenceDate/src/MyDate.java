public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
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
