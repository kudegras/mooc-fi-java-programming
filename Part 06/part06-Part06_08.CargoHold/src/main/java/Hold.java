
import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (weightOfSuitcases() + suitcase.totalWeight() <= maxWeight) {
            suitcases.add(suitcase);
        } else {
            return;
        }
    }

    public int weightOfSuitcases() {
        int weight = 0;
        for (Suitcase s: suitcases) {
            weight += s.totalWeight();
        }
        return weight;
    }

    public String toString() {
        return suitcases.size() + " suitcases (" + weightOfSuitcases() + " kg)";
    }

    public void printItems() {
        for (Suitcase s: suitcases) {
            s.printItems();
        }
    }
}
