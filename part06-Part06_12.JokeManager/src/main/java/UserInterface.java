/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MitchellMisayah
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");

            String command = scanner.nextLine();

            if (command.equals("1")) {
                System.out.println("Write a joke to be added: ");
                String joke = scanner.nextLine();
                manager.addJoke(joke);
            } else if (command.equals("2")) {
                String randomJoke = manager.drawJoke();
                System.out.println(randomJoke);

            } else if (command.equals("3")) {
                System.out.println("Printing the jokes.");
                manager.printJokes();
            } else if (command.equals("X")) {
                break;
            } else {
                System.out.println("Unknow command.");
            }

        }
    }
}

