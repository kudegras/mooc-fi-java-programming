
import java.util.ArrayList;

public class RecipeBook {

    private ArrayList<Recipe> recipes;

    public RecipeBook() {
        this.recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    public void searchName(String name) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe rcp: this.recipes) {
                if (rcp.getName().contains(name)) {
                    System.out.println(rcp);
                }
            }
            System.out.println("");
        }
    }

    public void searchTime(String time) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe rcp: this.recipes) {
                if (rcp.getTime() <= Integer.valueOf(time)) {
                    System.out.println(rcp);
                }
            }
            System.out.println("");
        }
    }

    public void searchIngredient(String ingredient) {
        if (this.recipes.isEmpty()) {
            System.out.println("None found");
        } else {
            for (Recipe rcp: this.recipes) {
                if (rcp.getIngredients().contains(ingredient)) {
                    System.out.println(rcp);
                }
            }
        }
    }

    public void printRecipeBook() {
        for (Recipe rcp: this.recipes) {
            System.out.println(rcp);
        }
        System.out.println("");
    }
}
