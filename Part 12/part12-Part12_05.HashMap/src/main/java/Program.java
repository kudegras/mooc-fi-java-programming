
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You can test the class here
        Map<String, String> hm = new Map<>();
        hm.add("hi", "kamusta");
        hm.add("ola", "aloha");
        System.out.println(hm.get("hi"));
        hm.remove("ola");
        System.out.println(hm.get("ola"));
    }

}
