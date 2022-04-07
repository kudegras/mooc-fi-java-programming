package title;

import java.util.Scanner;
import javafx.application.Application;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a title: ");
        String input = scanner.nextLine();
        
        Application.launch(UserTitle.class, "--userTitle=" + input);

    }

}
