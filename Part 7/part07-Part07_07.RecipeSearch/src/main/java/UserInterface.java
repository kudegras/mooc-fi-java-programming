
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private RecipeBook recipeBook;

    public UserInterface(Scanner scanner, RecipeBook recipeBook) {
        this.scanner = scanner;
        this.recipeBook = recipeBook;
    }

    public void start() {

        boolean shouldLoop = true;

        System.out.println("\nCommands:\n"
                + "list - lists the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient\n");
        
        while (shouldLoop) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "stop":
                    shouldLoop = false;
                    break;

                case "list":
                    System.out.println("Recipes: ");
                    recipeBook.printRecipeBook();
                    break;

                case "find name":
                    System.out.print("Searched word: ");
                    String searchWord = scanner.nextLine();
                    recipeBook.searchName(searchWord);
                    break;

                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    String maxTime = scanner.nextLine();
                    recipeBook.searchTime(maxTime);
                    break;

                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = scanner.nextLine();
                    recipeBook.searchIngredient(ingredient);
                    break;

                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
