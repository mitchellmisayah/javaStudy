import java.util.Scanner;
import java.util.ArrayList;

public class PersonalDetails {
    public static void main(String[] args){

        // Scanner
        Scanner reader = new Scanner(System.in);
        int birthYear = 0;
        int sum = 0;
        double average = 0;

        int nameLength = 0;
        int temp = 0; // temp
        String name = "";

        int counter = 0;

        while (true) {
            // 1. Get user input in this format. name,age
            String userInput = reader.nextLine();
            counter++;

            // Array to store the input and splits the input by comma.
            String[] myArray = userInput.split(",");

            if (userInput.isEmpty()) {
                break;
            }

            birthYear = Integer.valueOf(myArray[1]);
            nameLength = myArray[0].length();

            sum = sum + birthYear;

            // System.out.println(nameLength);

            if (temp < nameLength) {
                temp = nameLength;
                name = myArray[0];
            }

        } // end of while loop.

        // Subtract counter by 1 because the "enter" to break is counted on the counter.
        counter = counter - 1;
        // System.out.println("sum: " + sum);
        // System.out.println("counter: " + counter);

        average = (double) sum / counter;
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birthyears: " + average);

    }
}
