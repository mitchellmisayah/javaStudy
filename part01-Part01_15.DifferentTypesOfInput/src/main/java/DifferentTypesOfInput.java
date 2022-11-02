
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {       

        // Write your program here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a string: ");
        String aString = scanner.nextLine();
        System.out.println("Give an integer: ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double");
        double aDouble = Double.valueOf(scanner.nextLine());
        System.out.println("Give a boolean: ");
        boolean aBool = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("You gave the string "+aString);
        System.out.println("You gave the integer "+number);
        System.out.println("You gave the double "+aDouble);
        System.out.println("You gave the boolean "+aBool);
        
    }
}
