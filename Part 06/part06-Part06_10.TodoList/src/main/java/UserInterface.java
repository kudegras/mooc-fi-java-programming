
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private TodoList todoList;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {

        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            }

            processCommand(input);    
        }
    }

    public void processCommand(String command) {
        if (command.equals("add")) {
            add();
        } else if (command.equals("list")) {
            list();
        } else if (command.equals("remove")) {
            System.out.print("Which one is removed? ");
            int number = Integer.valueOf(scanner.nextLine());
            remove(number);
        }
    } 

    public void add() {
        System.out.print("To add: ");
        String toAdd = scanner.nextLine();
        this.todoList.add(toAdd);
    }

    public void list() {
        todoList.print();
    }

    public void remove(int number) {
        todoList.remove(number);
    }
}
