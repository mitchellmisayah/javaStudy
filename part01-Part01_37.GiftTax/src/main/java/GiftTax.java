
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double tax = 0;

        int amount = Integer.valueOf(scan.nextLine());
        if (amount < 4999) {
            System.out.println("No Tax!");
        } else if (amount >= 5000 && amount <= 25000) {
            tax = (100 + (amount - 5000) * 0.08);
            System.out.println("Tax: " + tax);
        } else if (amount >= 25000 && amount <= 55000) {
            tax = (1700 + (amount - 25000) * 0.10);
            System.out.println("Tax: " + tax);
        } else if (amount >= 55000 && amount <= 200000) {
            tax = (4700 + (amount - 55000) * 0.12);
            System.out.println("Tax: " + tax);
        } else if (amount >= 200000 && amount <= 1000000) {
            tax = (22100 + (amount - 200000) * 0.15);
            System.out.println("Tax: " + tax);
        } else if (amount >= 1000000) {
            tax = (142100 + (amount - 1000000) * 0.17);
            System.out.println("Tax: " + tax);
        }
    }
}
