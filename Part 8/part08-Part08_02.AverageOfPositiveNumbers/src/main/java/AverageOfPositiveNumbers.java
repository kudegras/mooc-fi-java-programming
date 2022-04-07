
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int counter = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input > 0) {
                sum += input;
                counter++;
            }
        }

        if (counter == 0) {
            System.out.println("Cannot calculate average"); 
        } else {
            System.out.println(1.0 * sum / counter);
        }
    }
}
