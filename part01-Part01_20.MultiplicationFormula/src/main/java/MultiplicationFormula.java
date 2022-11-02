
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        int data = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int data2 = Integer.valueOf(scanner.nextLine());
        
        int result = data * data2;
        System.out.println(data + " * " + data2 + " = " + result);

    }
}
