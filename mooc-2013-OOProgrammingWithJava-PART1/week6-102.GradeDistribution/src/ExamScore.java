public class ExamScore {
    private int value;
    private int grade;

    public ExamScore(int value) {
        this.value = value;
        if(this.value <= 29) {
            this.grade = 0;
        }
        else if(this.value >= 30 && this.value <= 34) {
            this.grade = 1;
        }
        else if(this.value >= 35 && this.value <= 39) {
            this.grade = 2;
        }
        else if(this.value >= 40 && this.value <= 44) {
            this.grade = 3;
        }
        else if(this.value >= 45 && this.value <= 49) {
            this.grade = 4;
        }
        else if(this.value >= 50 && this.value <= 60) {
            this.grade = 5;
        }
    }

    public int value() {
        return this.value;
    }

    public int grade() {
        return this.grade;
    }

    public boolean isWithinRange() {
        if(this.value >= 0 && this.value <= 60)
            return true;
        return false;
    }

    public boolean isAccepted() {
        if(this.grade > 0)
            return true;
        return false;
    }


}
