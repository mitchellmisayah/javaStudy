
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) throws Exception {

        Scanner reader = new Scanner(System.in);
        int greatestAge = 0;
        int age = 0;

        while (true) {

            System.out.println("name,age");
            String userInput = reader.nextLine();
            String[] parts = userInput.split(",");

            if (userInput.isEmpty()) {
                break;
            }
            age = Integer.valueOf(parts[1]);

            if (age > greatestAge) {
                greatestAge = age;
            }

        } // end of while
        System.out.println("Age of the oldest: " + greatestAge);
    }
}
