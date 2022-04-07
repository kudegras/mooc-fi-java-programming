
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<Integer> input = new ArrayList<>();
        
        while (true) {
            String row = scanner.nextLine();
            if (row.equals("end")) {
                break;
            }

            input.add(Integer.valueOf(row));

        }

        System.out.println("Print the average of the negative numbers or the positive numbers?(n/p)");
        char answer = scanner.next().charAt(0);
        if (answer == 'n') {
            System.out.println("Average of the negative numbers: " 
                    + input.stream().mapToInt(i -> i).filter(num -> num < 0).average().getAsDouble());
        } else {
            System.out.println("Average of the positive numbers: "
                    + input.stream().mapToInt(i -> i).filter(num -> num > 0).average().getAsDouble());
        }

    }
}
