
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i]);
            i++;
            if (i == array.length) {
                break;
            }
            System.out.print(", ");
        }
    }
}
