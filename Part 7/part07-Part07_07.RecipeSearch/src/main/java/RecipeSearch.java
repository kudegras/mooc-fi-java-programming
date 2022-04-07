
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RecipeBook recipeList = new RecipeBook();
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();


        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            ArrayList<String> fileLine = new ArrayList<>();

            while (fileScanner.hasNextLine()) {

                String line = fileScanner.nextLine();

                if (line.trim().isEmpty() || !fileScanner.hasNextLine()) {

                    String name = fileLine.get(0);
                    int time = Integer.valueOf(fileLine.get(1));
                    ArrayList<String> ingridientList = new ArrayList<>();

                    for (int i = 2; i < fileLine.size(); i++) {
                        ingridientList.add(fileLine.get(i));
                    }

                    recipeList.addRecipe(new Recipe(name, time, ingridientList));
                    fileLine.removeAll(fileLine);

                } else {

                    fileLine.add(line);
                }
            }

            fileScanner.close();

        } catch (Exception e) {
            System.out.println("Error reading the file " + e.getMessage());
        }

        UserInterface ui = new UserInterface(scanner, recipeList);
        ui.start();
    }
}