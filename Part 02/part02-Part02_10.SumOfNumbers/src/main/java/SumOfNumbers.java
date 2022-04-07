
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());

            if (num1 == 0) {
                break;
            }

            sum = sum + num1;
        }
        
        System.out.println("Sum of the numbers: " + sum);
    }
}
