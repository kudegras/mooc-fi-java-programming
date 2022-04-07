
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;

        while (true) {
            int num1 = Integer.valueOf(scanner.nextLine());

            if (num1 == 0) {
                break;
            }

            if (num1 > 0) {
                count = count + 1;
                sum = sum + num1;
            }

        }

        if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        }

        if (sum > 0) {
            System.out.println(1.0*sum/count);
        }
    }
}
