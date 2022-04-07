
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String str = scan.nextLine();
        System.out.println("Give an integer:");
        int num1 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double num2 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean bool = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+str);
        System.out.println("You gave the integer "+num1);
        System.out.println("You gave the double "+num2);
        System.out.println("You gave the boolean "+bool);
    }
}
