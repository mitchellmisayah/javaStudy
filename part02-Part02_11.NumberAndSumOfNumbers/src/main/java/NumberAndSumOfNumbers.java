
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        while(true) {
            System.out.println("Give a number: ");
            int userInput = Integer.valueOf(scan.nextLine());

            if(userInput == 0) {
                break;
            }
            counter++;
            sum += userInput;

        }
        System.out.println("Number of numbers: "+counter);
        System.out.println("Sum of the numbers: "+sum);

    }
}
