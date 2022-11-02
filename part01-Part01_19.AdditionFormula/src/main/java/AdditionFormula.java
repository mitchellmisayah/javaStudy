
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number: ");
        int data = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int data2 = Integer.valueOf(scanner.nextLine());
        
        int sum = data + data2;
        System.out.println(data + " + " + data2 + " = " + sum);

        // write your program here

    }
}
