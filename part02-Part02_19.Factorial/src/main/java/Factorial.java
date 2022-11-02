
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number: ");
        int userInput = Integer.valueOf(scan.nextLine());
        int factorialTotal = 1;

        for (int i = 1; i <= userInput; i++) {
            factorialTotal *= i;
        }
        System.out.println("Factorial: " + factorialTotal);
    }
}
