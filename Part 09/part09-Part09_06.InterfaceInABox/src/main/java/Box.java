
import java.util.ArrayList;

public class Box implements Packable {

    private double maxWeight;
    private ArrayList<Packable> itemsInBox;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.itemsInBox = new ArrayList<>();
    }

    public void add(Packable itemToPack) {
        if (weight() + itemToPack.weight() <= this.maxWeight) {
            this.itemsInBox.add(itemToPack);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : this.itemsInBox) {
            weight += item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + this.itemsInBox.size() + " items, total weight " + this.weight() + " kg";
    }
}
