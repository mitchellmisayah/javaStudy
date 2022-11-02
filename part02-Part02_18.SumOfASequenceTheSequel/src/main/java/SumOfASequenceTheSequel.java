
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First number? ");
        int firstNumber = Integer.valueOf(scan.nextLine());   
        System.out.println("Last number? ");
        int lastNumber = Integer.valueOf(scan.nextLine());       
        int sum = 0;

       

        for(int i = firstNumber; i <= lastNumber; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is "+sum);
        
    }
}
