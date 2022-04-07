
import java.util.ArrayList;

public class Pipe<T> {
    
    private ArrayList<T> values;

    public Pipe() {
        values = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        values.add(value);
    }

    public T takeFromPipe() {
        if (values.isEmpty()) {
            return null;
        }
        T oldestValue = values.get(0);
        values.remove(0);
        return oldestValue;
    }

    public boolean isInPipe() {
        return !values.isEmpty();
    }
}
