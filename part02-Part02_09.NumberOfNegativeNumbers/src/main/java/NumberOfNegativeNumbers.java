
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        int counter = 0;


        Scanner scan = new Scanner(System.in);
        
        while(true) {
            System.out.println("Give a number: ");
            int userInput = Integer.valueOf(scan.nextLine());

            if(userInput == 0) {
                break;
            }

            if(userInput < 0) {
                counter++;
            }
            
        }
        System.out.println("Number of negative numbers: "+ counter);
    }
}
