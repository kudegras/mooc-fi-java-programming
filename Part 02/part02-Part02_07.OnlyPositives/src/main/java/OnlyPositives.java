
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Give a number:");
            int num1 = Integer.valueOf(scanner.nextLine());
            
            if (num1 == 0) {
                break;
            }

            if (num1 > 0) {
                System.out.println(num1*num1);
                continue;
            }
            
            if (num1 < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
        }
    }
}
