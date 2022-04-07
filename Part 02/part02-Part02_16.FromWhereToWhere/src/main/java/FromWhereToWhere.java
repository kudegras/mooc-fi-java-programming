
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.print("Where to? ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int num2 = Integer.valueOf(scanner.nextLine());

        while (num2 <= num1) {
            System.out.println(num2);
            num2++;
        }
    }
}
