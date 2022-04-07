
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random rnd = new Random();

        while (numbers.size() < 7) {
            int lottoNum = rnd.nextInt(40) + 1;

            if (!containsNumber(lottoNum)) {
                numbers.add(lottoNum);
            }
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return numbers.contains(number);
    }
}

