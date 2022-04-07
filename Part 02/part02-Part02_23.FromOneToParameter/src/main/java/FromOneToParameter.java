

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);

    }
    public static void printUntilNumber(int numOfTimes) {
        int i = 0;
        while (i < numOfTimes) {
            i++;
            System.out.println(i);
        }
    }
}
