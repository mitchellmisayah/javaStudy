public class Debt {

    private double balance;
    private double interestRate;

    // Constructor. Initializes the objects.
    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.balance);
    }

    public void waitOneYear() {
        this.balance = this.balance * this.interestRate;
        
    }
}
