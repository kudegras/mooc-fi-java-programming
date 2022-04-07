

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }
    public static void printFromNumberToOne(int numOfTimes) {
        while (numOfTimes > 0) {
            System.out.println(numOfTimes);
            numOfTimes--;
        }
    }
}
