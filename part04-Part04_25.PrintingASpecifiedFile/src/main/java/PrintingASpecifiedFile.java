
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInputFile = scanner.nextLine();
        
        System.out.println("Which file should have its contents printed?");
        printFile(userInputFile);

    }
    public static void printFile(String file) {
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            // we read the file until all lines have been read.
            while (scanner.hasNextLine()) {
                // we read one line.
                String row = scanner.nextLine();
                // we print the line that we read.
                System.out.println(row);
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Error: " + e.getMessage());
        }
    }
}
