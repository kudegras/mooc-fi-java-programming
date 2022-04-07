
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        ArrayList<Integer> values = new ArrayList<>();

        while (true) {
            String read = scanner.nextLine();
            if (read.equals("end")) {
                break;
            }
            values.add(Integer.valueOf(read));
        }
    }

    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> positiveValues = numbers.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toCollection(ArrayList::new));
                
        return positiveValues;
    }

    public static List<Integer> positive2(List<Integer> numbers) {
        return numbers.stream().filter(number -> number > 0).collect(Collectors.toList()); 
        // use toCollection for ArrayList
    }

}
