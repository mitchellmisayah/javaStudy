
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int data = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int data2 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        int data3 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The sum of the numbers is " + (data + data2 + data3));

        // Write your program here

    }
}
