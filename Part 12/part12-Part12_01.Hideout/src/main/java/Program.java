
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you may try out your class here
        Hideout<Integer> den = new Hideout<>();
        System.out.println(den.isInHideout());
        den.putIntoHideout(1);
        System.out.println(den.isInHideout());
        System.out.println(den.isInHideout());
        System.out.println(den.takeFromHideout());
        System.out.println(den.isInHideout());
        
    }
}
