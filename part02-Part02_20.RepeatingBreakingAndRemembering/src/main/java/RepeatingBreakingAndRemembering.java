
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        double average = 0;
        int evenCounter = 0;
        int oddCounter = 0;

        System.out.println("Give numbers:");
        while (true) {
            //read input
            int userInput = Integer.valueOf(scan.nextLine());

            //end the loop -- break
            if (userInput == -1) {
                System.out.println("Thx! Bye!");
                break;
            }

            //check for valid input -- continue
            if (userInput > 0) {
                counter++;
                sum = sum + userInput;
                average = (double) sum / counter;

            }

            if (userInput % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }

        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + counter);
        System.out.println("Average: " + average);
        System.out.println("Even: " + evenCounter);
        System.out.println("Odd: " + oddCounter);

    }
}
