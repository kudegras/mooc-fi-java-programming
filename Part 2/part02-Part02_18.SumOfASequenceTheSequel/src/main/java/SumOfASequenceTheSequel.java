
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("First number? ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number? ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        int sum = 0;

        while (num1 <= num2) {
            sum += num1;
            num1++;
        }
        System.out.println("The sum is " + sum);
    }
}
