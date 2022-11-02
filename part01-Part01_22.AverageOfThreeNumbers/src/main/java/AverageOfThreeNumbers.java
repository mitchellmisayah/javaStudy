
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Give the first number: ");
        int data = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number: ");
        int data2 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number: ");
        int data3 = Integer.valueOf(scanner.nextLine());
        
        double result = (data+data2+data3)/3.0;
        System.out.println("The average is " + result);
    }
}
