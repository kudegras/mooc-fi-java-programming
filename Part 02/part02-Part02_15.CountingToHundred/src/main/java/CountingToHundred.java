
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.valueOf(scanner.nextLine());

        while (num1 <= 100) {
            System.out.println(num1);
            num1++;
        }
    }
}
