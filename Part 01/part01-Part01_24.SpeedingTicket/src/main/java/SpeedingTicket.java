
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Give speed:");
        int spd = Integer.valueOf(scanner.nextLine());
        if (spd > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
