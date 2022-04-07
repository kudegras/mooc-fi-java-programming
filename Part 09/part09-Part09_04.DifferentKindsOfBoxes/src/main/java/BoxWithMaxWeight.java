
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    
    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }

    public int currentAmount() {
        int sum = 0;
        for (Item i : items) {
            sum += i.getWeight();
        }
        return sum;
    }

    @Override
    public void add(Item item) {
        if (currentAmount() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
}
