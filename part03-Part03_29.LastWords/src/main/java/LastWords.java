import java.util.Scanner;

public class LastWords {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        while (true) {
            String userInput = reader.nextLine();
            String[] pieces = userInput.split(" ");

            if (userInput.isEmpty()) {
                break;
            }
            for (int i = 0; i < pieces.length; i++) {
                if (i == pieces.length - 1) {
                    System.out.println(pieces[i]);
                }
            }

        }

    }

}
