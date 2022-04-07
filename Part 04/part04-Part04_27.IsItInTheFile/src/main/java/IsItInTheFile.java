
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;;

public class IsItInTheFile {

    public static void main(String[] args) {
        boolean error = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try (Scanner scan = new Scanner(Paths.get(file))) {

            while(scan.hasNextLine()) {
                list.add(scan.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed.");
            error = true;
        }

        if (list.contains(searchedFor)) {
            System.out.println("Found!");
        } else if (error) {
            
        } else {
            System.out.println("Not found.");
        }
    }
}
