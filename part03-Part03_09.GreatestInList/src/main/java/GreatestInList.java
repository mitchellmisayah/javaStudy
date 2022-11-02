import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        
        System.out.println("");
        greatestNumber(list);

        // implement finding the greatest number in the list here
    }
    public static void greatestNumber(List<Integer> list) {
        int greatestNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            // System.out.println(list.get(i));
            int number = list.get(i);

            if (greatestNumber < number) {
                greatestNumber = number;
            }

        }
        System.out.println("The greatest number: " + greatestNumber);
    }
}
