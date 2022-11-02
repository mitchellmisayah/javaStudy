import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> bookList = new ArrayList<Book>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String inputTitle = scanner.nextLine();
            if (inputTitle.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int inputPages = Integer.valueOf(scanner.nextLine());

            System.out.println("Year: ");
            int inputYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(inputTitle, inputPages, inputYear));
        }

        System.out.println("What information will be printed? ");
        String userInput = scanner.nextLine();

        for (Book e : bookList) {
            if (userInput.toLowerCase().equals("name")) {
                System.out.println(e.getName());
            } else if (userInput.toLowerCase().equals("everything")) {
                System.out.println(e.toString());
            }
        }
    }
}
