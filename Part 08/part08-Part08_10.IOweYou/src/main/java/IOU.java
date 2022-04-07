
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> debt;

    public IOU() {
        this.debt = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debt.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.debt.getOrDefault(toWhom, 0.0);
    }
}
