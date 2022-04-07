
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameOfOldest = "null"; 
        int oldest = -1;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals(""))
            break;

            String[] parts = input.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);

            if (age > oldest) {
                oldest = age;
                nameOfOldest = name;
            }
        }

        System.out.println("Name of the oldest: " + nameOfOldest);
    }
}
