
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Where to? ");
        int userInput = Integer.valueOf(scan.nextLine());
        System.out.println("Where from? ");
        int userInput2 = Integer.valueOf(scan.nextLine());

        if(userInput < userInput2) {
            System.out.print("");
        }else{
            for(int i = userInput2; i <= userInput; i++) {
                System.out.println(i);
            }

        }
    }
}
