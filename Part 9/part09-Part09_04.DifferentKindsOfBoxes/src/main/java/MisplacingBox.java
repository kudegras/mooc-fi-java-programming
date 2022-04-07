
import java.util.ArrayList;

public class MisplacingBox extends Box {
    
    private ArrayList<Item> misplaceItem;

    public MisplacingBox() {
        this.misplaceItem = new ArrayList<>();
    }

    public void add(Item item) {
        this.misplaceItem.add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }
}
