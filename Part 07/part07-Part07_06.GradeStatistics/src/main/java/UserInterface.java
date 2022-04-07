
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private GradeRecord gradeRecord;

    public UserInterface(Scanner scanner, GradeRecord gradeRecord) {
        this.scanner = scanner;
        this.gradeRecord = gradeRecord;
    }

    public void start() {
        System.out.println("Enter point totals, -1 stops");
        while (true) {
            int input = Integer.valueOf(this.scanner.nextLine());
            if (input == -1) {
                gradeRecord.prinGrades();
                break;
            } else {
                gradeRecord.addGrade(input);
            }
        }
    }
}
