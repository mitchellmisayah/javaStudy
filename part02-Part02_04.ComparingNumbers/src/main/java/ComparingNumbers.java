
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        //Creating the scanner
        Scanner scan = new Scanner(System.in);

        //Reads two inputs from user
        int num1 = Integer.valueOf(scan.nextLine());
        int num2 = Integer.valueOf(scan.nextLine());

        // If first number is greater than second number print first is greater than second number

        if(num1 > num2) {
            System.out.println(num1 + " is greater than "+num2);
        }else if(num1 < num2) {
            System.out.println(num1 + " is smaller than "+num2);
        }else if(num1 == num2) {
            System.out.println(num1 + " is equal to "+num2);
        }
    }
}
