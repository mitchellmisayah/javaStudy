/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MitchellMisayah
 */
import java.util.Scanner;

public class UserInterface {
    private TodoList toDoList;
    private Scanner scanner;

    public UserInterface(TodoList toDoList, Scanner scanner) {
        this.toDoList = toDoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String userInput = scanner.nextLine();

            // Breaks out of while loop when user types "stop".
            if (userInput.equals("stop")) {
                break;
            }
            // When user types "add", it will proceed to add to the toDoList.
            if (userInput.equals("add")) {
                System.out.print("To add: ");
                String userInputAdd = scanner.nextLine();
                toDoList.add(userInputAdd);
            } else if (userInput.equals("list")) {
                toDoList.print();
            } else if (userInput.equals("remove")) {
                System.out.print("Which one is removed? ");
                int userInputRemove = Integer.valueOf(scanner.nextLine());
                toDoList.remove(userInputRemove);
            }
        }
    }

}

