
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int grade = Integer.valueOf(scan.nextLine());
        if (grade > 100) {
            System.out.println("Grade: incredible!");
        } else if (grade >= 90) {
            System.out.println("Grade: 5");
        } else if (grade >= 80) {
            System.out.println("Grade: 4");
        } else if (grade >= 70) {
            System.out.println("Grade: 3");
        } else if (grade >= 60) {
            System.out.println("Grade: 2");
        } else if (grade >= 50) {
            System.out.println("Grade: 1");
        } else if (grade >= 0) {
            System.out.println("Grade: failed");
        } else {
            System.out.println("Grade: impossible");
        }
    }
}
