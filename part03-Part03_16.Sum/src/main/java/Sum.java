import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        // System.out.println("The numbers in the range [0, 5]");
        // printNumbersInRange(numbers, 0, 5);

        // System.out.println("The numbers in the range [3, 10]");
        // printNumbersInRange(numbers, 3, 10);
        sum(numbers);

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit)
                System.out.println(number);
        }

    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum_total = 0;

        // If the list is empty.
        if (numbers.size() == 0) {
            return -1;
        }
        for (int number : numbers) {
            sum_total = sum_total + number;
        }
        System.out.println(sum_total);
        return sum_total;
    }

}
