public class Counter {
    private int startValue;

    // Constructors

    public Counter() {
        this.startValue = 0;
    }

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    // Methods
    public int value() {
        return this.startValue;
    }

    public void increase() {

        this.startValue = this.startValue + 1;
    }

    public void increase(int increaseBy) {

        if (this.startValue > 0 && increaseBy > 0)
            this.startValue = this.startValue + increaseBy;
    }

    public void decrease() {

        this.startValue = this.startValue - 1;
    }

    public void decrease(int decreaseBy) {
        if (this.startValue > 0 && decreaseBy > 0)
            this.startValue = this.startValue - decreaseBy;
    }

}
