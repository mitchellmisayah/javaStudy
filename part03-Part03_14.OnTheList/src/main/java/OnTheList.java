
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnTheList {
    public static void main(String[] args) {

        /*
         * The exercise template contains a base that reads numbers from the user and
         * adds them to a list. Reading is stopped once the user enters the number -1.
         * 
         * Modify the program so that after reading the numbers it calculates and prints
         * the sum of the numbers in the list.
         */

        // Make a list object
        ArrayList<String> namesList = new ArrayList<String>();

        // Make a scanner object
        Scanner scanner = new Scanner(System.in);

        // Make a while loop
        while (true) {
            // Request user input.
            String userInput = scanner.nextLine();

            // Conidition that if user inputs -1 then it will exit out the while loop.
            if (userInput.equals("")) {
                break;
            }

            // Adds the user input into the list.
            namesList.add(userInput);
        }

        System.out.println("Search for? ");
        String userInput2 = scanner.nextLine();

        if (namesList.contains(userInput2)) {
            System.out.println(userInput2 + " was found!");
        } else {
            System.out.println(userInput2 + " was not found!");
        }

    }
}
