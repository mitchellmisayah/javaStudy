
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class IsItInTheFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        boolean isFound = false;

        try (Scanner scannerFile = new Scanner(Paths.get(file))) {
            while (scannerFile.hasNextLine()) {
                String row = scannerFile.nextLine();
                if (row.equals(searchedFor)) {
                    isFound = true;
                }

            }

            if (isFound) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
