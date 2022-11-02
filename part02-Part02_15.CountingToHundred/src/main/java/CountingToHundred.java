
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int userInput = Integer.valueOf(scan.nextLine());

        for(int i = userInput; i < 101; i++){
            System.out.println(i);
        }
    }
}
