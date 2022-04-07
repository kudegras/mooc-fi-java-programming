
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable organism : this.herd) {
            organism.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String herd = "";
        for (Movable organism : this.herd) {
            herd += organism.toString() + "\n";
        }
        return herd;
    }
}
