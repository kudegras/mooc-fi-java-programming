
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String read = scanner.nextLine();
            if (read.isEmpty()) {
                break;
            }

            list.add(read);
        }

        list.stream().forEach(s -> System.out.println(s));
    }
}
