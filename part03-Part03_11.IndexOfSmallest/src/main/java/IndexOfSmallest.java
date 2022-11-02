
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IndexOfSmallest {
    public static void main(String[] args) throws Exception {
        /*
         * Expand the program by adding a functionality that asks the user for a number,
         * and reports that number's index in the list. If the number is not found, the
         * program should not print anything.
         */

        // Creating a list object
        ArrayList<Integer> list = new ArrayList<>();
        // Creating a scanner object
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 9999) {
                break;
            }

            list.add(userInput);

        }
        int theSmallestNumberVar = smallestNumber(list);

        // System.out.println("Search for? ");
        // int search = scanner.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (theSmallestNumberVar == list.get(i)) {
                System.out.println("Found at index: " + i);
            }

        }

    }

    public static int smallestNumber(List<Integer> list) {
        int smallestNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
            int number = list.get(i);

            if (smallestNumber > number) {
                smallestNumber = number;
            }

        }
        System.out.println("The smallestNumber number: " + smallestNumber);
        return smallestNumber;
    }

}
