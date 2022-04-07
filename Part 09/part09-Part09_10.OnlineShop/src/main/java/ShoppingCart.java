
import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        this.cart.putIfAbsent(product, new Item(product, 0, price));
        this.cart.get(product).increaseQuantity();
    }

    public int price() {
        int totalPrice = 0;

        for (Item item : cart.values()) {
            totalPrice += item.price();
        }

        return totalPrice;
    }

    public void print() {
        for (Item item : this.cart.values()) {
            System.out.println(item);
        }
    }
}
