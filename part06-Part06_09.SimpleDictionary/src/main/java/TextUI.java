import java.util.Scanner;

public class TextUI {

    // implement TextUI class that receieves as constructor a Scanner and
    // SimpleDictionary objects.
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {
        // the start method asks user for a command.
        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();

            // Condition: if user types "end" then it will break out while loop.
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (word.equals("add")) {
                System.out.print("Word: ");
                String addWord = scanner.nextLine();
                System.out.print("Translation: ");
                String translationWord = scanner.nextLine();

                dictionary.add(addWord, translationWord);
            } else if (word.equals("search")) {
                System.out.print("To be translated: ");
                String toBeTranslatedWord = scanner.nextLine();
                // if else statement here.
                String translatedWord = dictionary.translate(toBeTranslatedWord);
                if (translatedWord == null) {
                    System.out.println("Word " + toBeTranslatedWord + " was not found");

                } else {
                    System.out.print("Translation: " + translatedWord);
                    System.out.println();
                }

            } else {

                System.out.println("Unknown command");
            }

        } // End of while loop.
    }

}
