public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int ageCount, int restingHeartRateCount) {
        this.age = ageCount;
        this.restingHeartRate = restingHeartRateCount;

    }

    public double targetHeartRate(double precentageMaximum) {
        double maximumHeartRate = 206.3 - (0.711 * this.age);
        return (maximumHeartRate - this.restingHeartRate) * (precentageMaximum) + this.restingHeartRate;
    }
}
