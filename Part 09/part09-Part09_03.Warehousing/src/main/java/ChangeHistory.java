
import java.util.ArrayList;
import java.util.Collections;

public class ChangeHistory {
    
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }

        return Collections.max(history);
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0.0;
        }

        return Collections.min(history);
    }

    public double average() {
        int sum = 0;
        for (Double num : history) {
            sum += num;
        }
        return 1.0 * sum / this.history.size();
    }


    @Override
    public String toString() {
        return this.history.toString();
    }
    
}
