
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int container1 = 0;
        int container2 = 0;

        while (true) {
            System.out.println("First: " + container1 + "/100");
            System.out.println("Second: " + container2 + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String parts[] = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if (amount < 0) {
                amount = 0;
            }

            if (command.equals("add")) {

                container1 += amount;
                if (container1 > 100) {
                    container1 = 100;
                }

            } else if (command.equals("move")) {

                if (container1 == 0) {
                    return;

                } else if (amount <= container1) {
                    container1 -= amount;
                    container2 += amount;

                } else {
                    container2 += container1;
                    container1 = 0;
                }

                if (container2 > 100) {
                    container2 = 100;
                }

            } else if (command.equals("remove")) {

                if (container2 == 0) {
                    return;

                } else if (amount <= container2) {
                    container2 -= amount;

                } else {
                    container2 += container1;
                    container1 = 0;
                }

                if (container2 > 100) {
                    container2 = 100;
                }

            }
            System.out.println("");
        }
    }
}
