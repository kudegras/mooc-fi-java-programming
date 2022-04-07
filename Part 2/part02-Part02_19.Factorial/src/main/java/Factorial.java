
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num1 = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int fact = 1;

        while (i <= num1) {
            fact *= i;
            i++;
        }
        
        System.out.println("Factorial: " + fact);
    }
}
