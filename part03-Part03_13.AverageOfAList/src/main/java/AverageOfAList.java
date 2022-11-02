
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfAList {
    public static void main(String[] args) {

        /*
         * The exercise template contains a base that reads numbers from the user and
         * adds them to a list. Reading is stopped once the user enters the number -1.
         * 
         * Modify the program so that after reading the numbers it calculates and prints
         * the sum of the numbers in the list.
         */

        // Make a list object
        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        // Make a scanner object
        Scanner scanner = new Scanner(System.in);

        // Make a while loop
        while (true) {
            // Request user input.
            int userInput = scanner.nextInt();

            // Conidition that if user inputs -1 then it will exit out the while loop.
            if (userInput == -1) {
                break;
            }

            // Adds the user input into the list.
            numbersList.add(userInput);
        }

        int sum = sumList(numbersList);
        averageList(numbersList, sum);

    }

    public static int sumList(List<Integer> numbersList) {
        int sum = 0;
        for (int number : numbersList) {
            // System.out.println(number);
            sum += number;
        }
        // System.out.println("Sum: " + sum);
        return sum;
    }

    public static double averageList(List<Integer> numbersList, int sum) {
        double average = 0;
        average = (double) sum / numbersList.size();
        System.out.println("Average: " + average);
        return average;
    }

}
