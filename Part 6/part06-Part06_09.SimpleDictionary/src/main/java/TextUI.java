
import java.util.Scanner;

public class TextUI {
    private SimpleDictionary simpleDictionary;
    private Scanner scanner;
    
    public TextUI (Scanner scanner, SimpleDictionary simpleDictionary) {
        this.simpleDictionary = simpleDictionary;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;

            } else if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.simpleDictionary.add(word, translation);

            } else if (input.equals("search")) {
                System.out.print("To be translated: ");
                String toTranslate = scanner.nextLine();
                
                if (this.simpleDictionary.translate(toTranslate) == null) {
                    System.out.println("Word " + toTranslate + " was not found");
                } else {
                    System.out.println("Translation: " + this.simpleDictionary.translate(toTranslate));
                }

            } else {
                System.out.println("Unknown command");
            }
        }
    }
}
