import java.util.Scanner;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Items> myList = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();

            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            Items items = new Items(identifier, name);

            if (myList.contains(items)) {
                System.out.println("Already in list");
            } else {
                myList.add(items);
            }

        }

        System.out.println("==Items==");
        for (Items item : myList) {
            System.out.println(item);
        }

    }
}
