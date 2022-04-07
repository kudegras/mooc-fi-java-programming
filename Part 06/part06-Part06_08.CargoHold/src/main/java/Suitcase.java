
import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public int totalWeight() {
        int weight = 0;
        for (Item i: items) {
            weight += i.getWeight();
        }
        return weight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        } else {
            return;
        }
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }
        if (this.items.size() == 1) {
            return "1 item (" + totalWeight() + " kg)"; 
        }
        return items.size() + " items (" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Item i: items) {
            System.out.println(i);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);
        for (Item i: items) {
            if (i.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = i;
            }
        }
        return heaviestItem;  
    }
}
