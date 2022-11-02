
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0;
        int counter = 0;
        double average = 0;
        //System.out.println("counter: " + counter);

        while(true) {
            int userInput = Integer.valueOf(scan.nextLine());

            if(userInput == 0){
                break;
            }
            if(userInput > 0){
                counter++;
                //System.out.println("counter: " + counter);
                sum += userInput;
            }

        }
        if(counter == 0){

            System.out.println("Cannot calculate the average");
        }
        //System.out.println("sum: "+sum);
        //System.out.println("counter: " + counter);
        average = sum / counter;
        System.out.println(average);
    }
}
