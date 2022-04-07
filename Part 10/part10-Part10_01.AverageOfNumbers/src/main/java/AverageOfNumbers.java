
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here

        System.out.println("Input numbers, type \"end\" to stop.");
        ArrayList<Integer> input = new ArrayList<>();

        while (true) {
            String read = scanner.nextLine();

            if (read.equals("end")) {
                break;
            }

            input.add(Integer.valueOf(read));

        }

        System.out.println("average of the numbers: " + input.stream().mapToInt(i -> i).average().getAsDouble());

    }
}