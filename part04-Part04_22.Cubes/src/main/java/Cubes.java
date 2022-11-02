
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cubed = 0;
        while (true) {

            String userInput = scanner.nextLine();
            if (userInput.equals("end")) {
                break;
            }
            int userInputToInt = Integer.valueOf(userInput);

            cubed = userInputToInt * userInputToInt * userInputToInt;
            System.out.println(cubed);
        }
    }
}
