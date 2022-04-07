
public class List<T> {

    private T[] values;
    private int firstFreeIndex;

    public List() {
        values = (T[]) new Object[10];
        firstFreeIndex = 0;
    }

    public void add(T value) {
        if (firstFreeIndex == values.length) {
            grow();
        }

        values[firstFreeIndex] = value;
        firstFreeIndex++;
    }

    public boolean contains(T value) {
        return indexOfValue(value) >= 0;
    }

    public void remove(T value) {
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return;
        }

        moveToTheLeft(indexOfValue);
        firstFreeIndex--;
    }

    private void grow() {
        int newSize = values.length + values.length / 2;
        T[] newValues = (T[]) new Object[newSize];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }

        values = newValues;
    }

    public T value(int index) {
        if (index < 0 || index >= firstFreeIndex) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + firstFreeIndex + "]");
        }

        return values[index];
    }

    public int indexOfValue(T value) {
        for (int i = 0; i < firstFreeIndex; i++) {
            if (values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }

    public int size() {
        return firstFreeIndex;
    }

    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < firstFreeIndex - 1; i++) {
            values[i] = values[i + 1];
        }
    }
}
