
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations required here!
        HashMap<String, String> names = new HashMap<>();
        names.put("matt", "matthew");
        names.put("mix", "michael");
        names.put("artie", "arthur");

        String name = names.get("matt");
        System.out.println(name);
    }
}
