
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int data1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int data2 = Integer.valueOf(scanner.nextLine());
        
        
        int add_result = data1 + data2;
        int minus_result = data1 - data2;
        int multiply_result = data1 * data2;
        double divide_result = (double)data1 / (double)data2;
        
        System.out.println(data1 + " + " + data2 + " = " + (add_result));
        System.out.println(data1 + " - " + data2 + " = " + (minus_result));
        System.out.println(data1 + " * " + data2 + " = " + (multiply_result));
        System.out.println(data1 + " / " + data2 + " = " + (divide_result));
       
    }
}
