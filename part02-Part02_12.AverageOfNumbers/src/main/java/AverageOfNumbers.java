
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        int counter = 0;
        double sum = 0;
        double average = 0;

        while(true) {
            System.out.println("Give a number: ");
            int userInput = Integer.valueOf(scan.nextLine());

            if(userInput ==0){
                break;
            }

            counter++;
            sum += userInput;

        }
        average = (sum / counter);
        //System.out.println(counter);
        //System.out.println(sum);
        System.out.println("Average of the numbers: "+ average);

    }
}
