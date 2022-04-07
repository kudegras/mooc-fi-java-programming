
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int num2 = Integer.valueOf(scanner.nextLine());
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        double quo = 1.0 * num1/num2;
        System.out.println(num1+" + "+num2+" = "+sum);
        System.out.println(num1+" - "+num2+" = "+diff);
        System.out.println(num1+" * "+num2+" = "+prod);
        System.out.println(num1+" / "+num2+" = "+quo);
    }
}
