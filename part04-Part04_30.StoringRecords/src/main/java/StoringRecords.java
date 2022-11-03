
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        String[] dataArray;
        String row, name;
        int age;

        // Write here the code for reading from file
        // and printing the read records

        try (Scanner scanner = new Scanner(Paths.get(file))) {
            // we read the file until all lines have been read.
            while (scanner.hasNextLine()) {
                row = scanner.nextLine();
                dataArray = row.split(",");

                name = dataArray[0];
                age = Integer.valueOf(dataArray[1]);

                persons.add(new Person(name, age));

            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
        return persons;

    }
}
