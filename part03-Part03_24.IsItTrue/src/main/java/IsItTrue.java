import java.util.Scanner;

public class IsItTrue {
    /*
     * Write a program that asks the user for a string. If the user writes the
     * string "true", the program prints "You got it right!", otherwise it prints
     * "Try again!".
     */
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.print("Give a string: ");
        String aString = reader.nextLine();

        if (aString.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
}
