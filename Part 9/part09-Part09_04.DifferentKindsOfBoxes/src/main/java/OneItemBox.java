
import java.util.ArrayList;

public class OneItemBox extends Box{

    private ArrayList<Item> oneItem;

    public OneItemBox() {
        this.oneItem = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (this.oneItem.size() < 1) {
            oneItem.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.oneItem.contains(item);
    }
}
