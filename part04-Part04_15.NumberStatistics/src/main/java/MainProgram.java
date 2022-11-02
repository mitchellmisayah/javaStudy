
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics statisticsEven = new Statistics();
        Statistics statisticsOdd = new Statistics();

        System.out.println("Enter numbers: ");

        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {
                break;
            }

            if (userInput % 2 == 0) {
                statisticsEven.addNumber(userInput);
            }

            if (userInput % 2 == 1) {
                statisticsOdd.addNumber(userInput);
            }

            statistics.addNumber(userInput);

        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of Even numbers: " + statisticsEven.sum());
        System.out.println("Sum of Odd numbers: " + statisticsOdd.sum());
    }
}
