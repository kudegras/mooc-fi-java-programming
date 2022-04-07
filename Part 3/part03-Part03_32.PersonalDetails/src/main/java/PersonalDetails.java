
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = 0;
        int longestNameLength = 0;
        String name = "";
        int i = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            int nameLength = parts[0].length();
            year += Integer.valueOf(parts[1]);
            i++;

            if (nameLength > longestNameLength ) {
                longestNameLength = nameLength;
                name = parts[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * year/i);

    }
}
