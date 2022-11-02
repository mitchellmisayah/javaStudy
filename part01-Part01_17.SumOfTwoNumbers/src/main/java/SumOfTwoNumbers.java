
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int first_number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int second_number = Integer.valueOf(scanner.nextLine());
        // do something with the numbers
        
        int sum_of_numbers = first_number + second_number;
        
        System.out.println("The sum of the numbers is "+sum_of_numbers);

    }
}
