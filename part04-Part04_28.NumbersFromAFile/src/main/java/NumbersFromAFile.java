import java.util.Scanner;
import java.nio.file.Paths;

public class NumbersFromAFile {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.println("File?");
        String nameFile = scanner.nextLine();

        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());

        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());


        try (Scanner fileScanner = new Scanner(Paths.get(nameFile))) {
            // read the file until all the lines have been read.
            while (fileScanner.hasNextLine()) {
                int number = Integer.valueOf(fileScanner.nextLine());
                if (number >= lowerBound && number <= upperBound) {
                    // System.out.println(number);
                    counter++;

                }
            }
            System.out.println("Numbers: " + counter);

        } catch (Exception e) {
            System.out.println("file not found" + e.getMessage());
        }
    }
}
