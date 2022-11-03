import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) throws Exception {

        // 1. Create a scanner for user input.
        Scanner scanner = new Scanner(System.in);

        // 2. Prompt the user for the name of the file.
        System.out.println("Name of the file: ");

        // 3. Store the user input into a String variable.
        String file = scanner.nextLine();

        // Data will look like this: lily,3.
        // You want the out put to look like this: lily, age: 3 years.

        String[] dataArray;
        String name, row;
        int age;

        // 4. Implement reading file.
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            // we read the file until all lines have been read.

            while (fileScanner.hasNextLine()) {
                row = fileScanner.nextLine();
                // we read one line.
                dataArray = row.split(",");
                name = dataArray[0];
                age = Integer.valueOf(dataArray[1]);

                if (age == 1) {
                    System.out.println(name + ", " + "age: " + age + " year");
                } else {
                    System.out.println(name + ", " + "age: " + age + " years");
                }

            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }

    }

}
