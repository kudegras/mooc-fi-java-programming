
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        double average = 0;

        while (true) {
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());

            if (num1 == 0) {
                break;
            }

            count = count + 1;
            sum = sum + num1;
        }

        System.out.print("Average of the numbers: " + (1.0*sum/count));
    }
}
