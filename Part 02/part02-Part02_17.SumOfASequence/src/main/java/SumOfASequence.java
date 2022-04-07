
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Last Number? ");
        int num1 = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int sum = 0;

        while (i <= num1) {
            sum += i;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
